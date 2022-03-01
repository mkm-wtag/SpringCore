package com.TransactionManagement.helpzee.declarative.TransactionalAnnotation;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PurchaseProduct implements ProductInterface {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Transactional
    public boolean buyProduct(String username, int productId){
        int price= jdbcTemplate.queryForObject("select price from products where id=?",new Object[]{productId},Integer.class);
        int stockCheck=jdbcTemplate.queryForObject("select stock from products where id=?",new Object[]{productId},Integer.class);
        if(stockCheck<1){
            System.out.println("Stock out of product with id "+productId);
            return false;
        }
        jdbcTemplate.update("update products set stock=stock-1 where id=?", productId);
        jdbcTemplate.update("update account set amount=amount-? where username=?", price,username);
        return true;
    }

    public void displayState(String username, int productId){
        System.out.println("DataBase state after purchase");
        Product product =jdbcTemplate.queryForObject("select * from products where id=?", new Object[]{productId}, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product=new Product();
                product.setProductId(rs.getInt("id"));
                product.setProductName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setStock(rs.getInt("stock"));
                return product;
            }
        });
        System.out.println(product);
        Account account=jdbcTemplate.queryForObject("select * from account where username =?", new Object[]{username}, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account=new Account();
                account.setBalance(rs.getInt("amount"));
                account.setUsername(rs.getString("username"));
                return account;
            }
        });
        System.out.println(account);
    }
}
