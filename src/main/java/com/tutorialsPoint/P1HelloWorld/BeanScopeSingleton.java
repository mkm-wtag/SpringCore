package com.tutorialsPoint.P1HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSingleton {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMessage("My name is Milton Kabir");
        System.out.println(helloWorld.toString());
        HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.toString());

    }
}
