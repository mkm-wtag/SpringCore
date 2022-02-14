package com.journaldev.IOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        MyService myService=context.getBean(MyService.class);
        context.close();

    }
}
