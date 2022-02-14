package com.tutorialsPoint.P6RequiredAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Autowired(required = false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
