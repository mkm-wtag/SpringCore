package com.test;

public class Transmission {
    private String type;



    public Transmission(String type) {
        this.type = type;
        System.out.println("Transmission Created");

    }

    @Override
    public String toString() {
        return "Transmission : {" +
                "\n\ttype='" + type + '\'' +
                "\n\t}";
    }

}
