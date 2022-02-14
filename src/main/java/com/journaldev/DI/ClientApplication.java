package com.journaldev.DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication myApplication=context.getBean(MyApplication.class);
        myApplication.processMessage("Hi Milton", "milton@welldev.io");
//        context.close();
    }
}
