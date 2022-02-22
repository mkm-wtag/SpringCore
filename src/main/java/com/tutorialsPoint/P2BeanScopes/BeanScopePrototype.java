package com.tutorialsPoint.P2BeanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class BeanScopePrototype {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        HelloWorldPrototype helloWorld = (HelloWorldPrototype) context.getBean("helloWorldPrototype");
        Resource resource=context.getResource("/Users/miltonkabirmilon/Desktop/SPRING/SpringCore/src/main/resources/spring.xml");
        helloWorld.setMessage("My name is Milton Kabir");
        System.out.println(helloWorld.toString());
        HelloWorldPrototype obj= (HelloWorldPrototype) context.getBean("helloWorldPrototype");
        System.out.println(obj.toString());

    }
}
