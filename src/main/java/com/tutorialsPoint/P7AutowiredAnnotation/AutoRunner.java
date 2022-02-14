package com.tutorialsPoint.P7AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
//        TextEditor textEditor= (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();
    }
}
