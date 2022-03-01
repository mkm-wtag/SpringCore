package com.TransactionManagement.helpzee.declarative.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("helpzee.xml");
        PurchaseProduct purchaseProduct=context.getBean("purchaseProduct",PurchaseProduct.class);
        purchaseProduct.buyProduct("user1",101);
        purchaseProduct.displayState("user1",101);
        purchaseProduct.buyProduct("user2",102);
        purchaseProduct.displayState("user2",102);
    }
}
