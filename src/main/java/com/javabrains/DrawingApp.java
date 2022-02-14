package com.javabrains;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class DrawingApp {

    public static void main(String[] args) {
        
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();

    }
}
