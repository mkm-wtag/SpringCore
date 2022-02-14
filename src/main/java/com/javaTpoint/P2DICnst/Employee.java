package com.javaTpoint.P2DICnst;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee() {
        this.name="John Doe";
        this.id=1123456789;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee : {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
