package com.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        return null;
        System.out.println("In After Initialization method. Bean name is "+ s);
        return o ;
    }


    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("In Before Initialization method. Bean name is "+ s);
        return o;
    }
}
