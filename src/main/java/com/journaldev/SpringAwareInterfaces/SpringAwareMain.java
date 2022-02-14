package com.journaldev.SpringAwareInterfaces;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAwareMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(myAwareConfig.class);
        MyAwareService myAwareService=context.getBean(MyAwareService.class);
        context.close();
    }
}
