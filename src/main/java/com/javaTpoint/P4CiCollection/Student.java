package com.javaTpoint.P4CiCollection;

public class Student {
    private String name;
    private String area;

    public Student(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "\n\tStudent : {" +
                "\n\tname='" + name + '\'' +
                ",\\tnarea='" + area + '\'' +
                "\n\t}";
    }
}
