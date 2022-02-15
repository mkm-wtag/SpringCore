package com.javabrains.AOP.model;

public class Triangle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nTriangle{" +
                "\nname='" + name + '\'' +
                "\n}";
    }
}
