package com.TransactionManagement.helpzee.declarative.AOP;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseProduct {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void buyProduct(String username, int productId){
        try{
            int price=jdbcTemplate.queryForObject("select price from products where id = ?",new Object[]{productId},Integer.class);
            jdbcTemplate.update("update products set stock=stock-1 where id = ?",new Object[]{productId});
            jdbcTemplate.update("update account set amount=amount-? where username=?",new Object[]{price,username});
        }
        catch (DataAccessException e){
            throw e;
        }
    }

    public void displayState(String username, int productId){
        System.out.println("Database State after purchase");
        Product product=jdbcTemplate.queryForObject("select * from products where id = ?", new Object[]{productId}, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product=new Product();
                product.setPrice(rs.getInt("price"));
                product.setProductId(rs.getInt("id"));
                product.setProductName(rs.getString("name"));
                product.setStock(rs.getInt("stock"));
                return product;
            }
        });
        System.out.println(product);

        Account account=jdbcTemplate.queryForObject("select * from account where username = ?", new Object[]{username}, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account=new Account();
                account.setUsername(rs.getString("username"));
                account.setBalance(rs.getInt("amount"));
                return account;
            }
        });
        System.out.println(account);
    }
}
