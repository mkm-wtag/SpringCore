package com.DataBinder;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class DataBinderRunner {
    public static void main(String[] args) {
        MutablePropertyValues mutablePropertyValues=new MutablePropertyValues();
        mutablePropertyValues.add("anInt",13);
        TestBean testBean=new TestBean();
        DataBinder dataBinder=new DataBinder(testBean);
        dataBinder.bind(mutablePropertyValues);
        System.out.println(testBean);
    }
}
