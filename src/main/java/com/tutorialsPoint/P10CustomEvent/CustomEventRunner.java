package com.tutorialsPoint.P10CustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        CustomEventPublisher cvp= (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();;
        cvp.publish();
    }
}
