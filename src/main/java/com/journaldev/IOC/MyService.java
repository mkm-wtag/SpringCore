package com.journaldev.IOC;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {
    @PostConstruct
    public void init(){
        System.out.println("MyService init method Called");
    }

    public MyService() {
        System.out.println("MyService Constructor Called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("MyService destroy method Called");
    }
}
