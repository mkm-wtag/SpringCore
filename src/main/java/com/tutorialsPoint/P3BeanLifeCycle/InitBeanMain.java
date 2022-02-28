package com.tutorialsPoint.P3BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitBeanMain {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        context.registerShutdownHook();
        BeanInitEg obj= (BeanInitEg) context.getBean("helloWorld");
        System.out.println("Hello "+ obj.getMessage());
        BeanInitEg obj2= (BeanInitEg) context.getBean("helloWorld");
        System.out.println("Hello "+ obj2.getMessage());
        System.out.println(obj.hashCode()+" "+obj2.hashCode());

    }
}
