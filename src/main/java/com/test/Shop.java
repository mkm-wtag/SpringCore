package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component("com.test.Shop")
public class Shop {
    private Car car;
    @Autowired
    public Shop(Car car){
        this.car=car;
    }

    @Override
    public String toString() {
        return "Shop : {" +
                "\n\tcar=" + car +
                "\n\t}";
    }
}
