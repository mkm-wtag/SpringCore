package com.javabrains;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Component
public class Circle implements Shape{

    @Resource(name = "pointC")
    private Point centre;
    public void setCentre( Point centre) {
        this.centre = centre;
    }
    public Point getCentre() {
        return centre;
    }

    @Override
    public void draw() {
        System.out.println("Centre of the circle is "+ centre);
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Circle Initialization");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Circle Destroyed");
    }
}
