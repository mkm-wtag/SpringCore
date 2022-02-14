package com.tutorialsPoint.P8JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentRunner {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student=context.getBean(Student.class);
        student.setId(140116);
        student.setName("Milton Kabir");
        System.out.println(student);
    }
}
