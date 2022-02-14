package com.javaTpoint.P4CiCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RUnner {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("javaTpoint.xml");
        ZillaSomity zillaSomity= (ZillaSomity) context.getBean("zillaSomity");
        System.out.println(zillaSomity.toString());
    }
}
