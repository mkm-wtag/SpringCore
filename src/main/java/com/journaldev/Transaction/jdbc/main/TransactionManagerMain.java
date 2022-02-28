package com.journaldev.Transaction.jdbc.main;

import com.journaldev.Transaction.jdbc.model.Address;
import com.journaldev.Transaction.jdbc.model.Customer;
import com.journaldev.Transaction.jdbc.service.CustomerManager;
import com.journaldev.Transaction.jdbc.service.CustomerManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("journaldev.xml");
        CustomerManager customerManager=context.getBean("customerManager", CustomerManagerImpl.class);
        Customer customer=createDummyCustomer();
        customerManager.createCustomer(customer);
        context.close();
    }
    private static Customer createDummyCustomer(){
        Customer customer=new Customer();
        customer.setId(140116);
        customer.setName("Milton Kabir");
        Address address=new Address();
        address.setId(140116);
        address.setCountry("Bangladesh");
        address.setAddress("Kushtia");
        customer.setAddress(address);
        return customer;
    }
}
