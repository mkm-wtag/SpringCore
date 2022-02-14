package com.tutorialsPoint.P9EventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        context.start();
        MessageClass obj= (MessageClass) context.getBean("messageClass");
        System.out.println(obj.toString());
        context.stop();
    }
}
