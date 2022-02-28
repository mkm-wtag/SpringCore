package com.TransactionManagement.helpzee.programmatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("helpzee.xml");
        BuyProduct buyProduct= (BuyProduct) context.getBean("buyProduct");
        buyProduct.buyProduct("user1",101);
        buyProduct.displayState("user1",101);
        buyProduct.buyProduct("user2",102);
        buyProduct.displayState("user2",102);
    }
}
