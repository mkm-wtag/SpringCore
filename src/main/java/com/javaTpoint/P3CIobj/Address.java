package com.javaTpoint.P3CIobj;

public class Address {
    private String city;
    private String Division;

    public Address(String city, String division) {
        this.city = city;
        Division = division;
    }

    @Override
    public String toString() {
        return "Student : {" +
                "\ncity='" + city + '\'' +
                ",\nDivision='" + Division + '\'' +
                "\n}";
    }
}
