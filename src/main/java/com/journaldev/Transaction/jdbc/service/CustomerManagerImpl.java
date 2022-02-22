package com.journaldev.Transaction.jdbc.service;

import com.journaldev.Transaction.jdbc.dao.CustomerDAO;
import com.journaldev.Transaction.jdbc.model.Customer;

public class CustomerManagerImpl implements CustomerManager{
    private CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public void createCustomer(Customer cust) {
        customerDAO.create(cust);
    }
}
