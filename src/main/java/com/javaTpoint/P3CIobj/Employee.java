package com.javaTpoint.P3CIobj;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(Address address, int id, String name) {
        this.address = address;
        this.id = id;
        this.name = name;
    }

    public Employee() {
        System.out.println("Nothing to add");
    }

    @Override
    public String toString() {
        return "Employee : {" +
                "\nid=" + id +
                ",\nname='" + name + '\'' +
                ",\naddress=" + address +
                "\n}";
    }
}
