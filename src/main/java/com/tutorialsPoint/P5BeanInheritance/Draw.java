package com.tutorialsPoint.P5BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        Rectangle obj= (Rectangle) context.getBean("rectangle");
        System.out.println(obj.toString());
    }
}
