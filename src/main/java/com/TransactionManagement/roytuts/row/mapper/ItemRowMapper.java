package com.TransactionManagement.roytuts.row.mapper;

import com.TransactionManagement.roytuts.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Item> {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item();
        item.setItemId(rs.getLong("item_id"));
        item.setItemName(rs.getString("item_name"));
        item.setItemDesc(rs.getString("item_desc"));
        item.setItemPrice(rs.getDouble("item_price"));
        return item;
    }
}
