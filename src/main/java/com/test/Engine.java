package com.test;

public class Engine {
    private String type;


    public Engine(String type) {
        this.type = type;
        System.out.println("Engine Created");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "\n\ttype='" + type + '\'' +
                "\n\t}";
    }
}
