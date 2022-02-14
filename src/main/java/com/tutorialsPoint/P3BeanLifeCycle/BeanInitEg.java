package com.tutorialsPoint.P3BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInitEg implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean has been initialized");
    }

    public void init(){
        System.out.println("Manually initialize function");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BEan has been destroyed");
    }
    public  void des(){
        System.out.println("manually destroyed");
    }
}
