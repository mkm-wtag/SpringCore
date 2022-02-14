package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("com.test.car")
public class Car {
    private String name;
    private Engine engine;
    private Transmission transmission;

//    @Autowired

    public Car(String name, Engine engine, Transmission transmission) {
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car\n{" +
                "\nengine=" + engine +
                ",\ntransmission=" + transmission +
                "\n}";
    }
}
