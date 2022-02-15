package com.javabrains.AOP.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle Setter called");
        throw (new RuntimeException());
    }

    @Override
    public String toString() {
        return "\nCircle{" +
                "\nname='" + name + '\'' +
                "\n}";
    }
}
