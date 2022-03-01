package com.TransactionManagement.roytuts.service;

import com.TransactionManagement.roytuts.dao.ItemDao;
import com.TransactionManagement.roytuts.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemDao itemDao;
    public List<Item> getItems() {
        return itemDao.getItems();
    }
}