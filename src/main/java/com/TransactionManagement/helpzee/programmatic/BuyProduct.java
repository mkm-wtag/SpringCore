package com.TransactionManagement.helpzee.programmatic;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyProduct {
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager platformTransactionManager;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    public void buyProduct(String username,int productId){
        TransactionDefinition definition=new DefaultTransactionDefinition();
        TransactionStatus status= platformTransactionManager.getTransaction(definition);
        try {
            int price = jdbcTemplate.queryForObject( "SELECT PRICE FROM PRODUCTS WHERE Id = ?",new Object[] {productId },Integer.class);
            jdbcTemplate.update("UPDATE PRODUCTS SET STOCK = STOCK - 1 WHERE ID = ?", new Object[]{productId});
            jdbcTemplate.update( "UPDATE ACCOUNT SET AMOUNT = AMOUNT - ?  WHERE USERNAME = ?", new Object[] { price, username });
            platformTransactionManager.commit(status);
        }
        catch (DataAccessException e){
            platformTransactionManager.rollback(status);
            throw e;
        }
    }

    public void displayState(String username, int productId){
        System.out.println("Database State after purchase");
        Product product =jdbcTemplate.queryForObject("SELECT * FROM PRODUCTS WHERE ID = ? ", new Object[]{productId}, new RowMapper<Product>() {
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

        Account account=jdbcTemplate.queryForObject("SELECT * FROM ACCOUNT WHERE USERNAME = ?", new Object[]{username}, new RowMapper<Account>() {
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
