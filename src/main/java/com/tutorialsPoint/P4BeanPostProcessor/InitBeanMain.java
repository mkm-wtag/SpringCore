package com.tutorialsPoint.P4BeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitBeanMain {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        BeanPrcsEg obj= (BeanPrcsEg) context.getBean("beanPostPrcs");
        System.out.println(obj.toString());
        context.registerShutdownHook();
    }
}
