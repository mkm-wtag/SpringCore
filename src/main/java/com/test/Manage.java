package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manage {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("Config.class");
        Shop shop=context.getBean(Shop.class);
        System.out.println(shop.toString());
    }
}
