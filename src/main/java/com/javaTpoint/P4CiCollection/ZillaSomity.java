package com.javaTpoint.P4CiCollection;

import java.util.ArrayList;

public class ZillaSomity {
    ArrayList<Student> arrayList=new ArrayList<>();

    public ZillaSomity(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public ZillaSomity() {
    }

    @Override
    public String toString() {
        return "ZillaSomity : {" +
                "\n\tarrayList=" + arrayList +
                "\n}";
    }
}
