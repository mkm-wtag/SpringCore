package com.TransactionManagement.roytuts.dao;

import com.TransactionManagement.roytuts.model.Item;
import com.TransactionManagement.roytuts.row.mapper.ItemRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Item> getItems() {
        String sql = "SELECT * FROM item";
        List<Item> items = new ArrayList<>();
        items = jdbcTemplate.query(sql, new ItemRowMapper());
        return items;
    }
}