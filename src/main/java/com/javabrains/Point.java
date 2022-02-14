package com.javabrains;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //    @Override
//    public void destroy() throws Exception {
//        System.out.println("Destroying point");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing point");
//    }
    public void myInitPint() {
        System.out.println("Initializing Point");
    }

    public void myDes() {
        System.out.println("Destroying Point");
    }
    public void myDefInit() {
        System.out.println("INIT!!!");
    }

    public void  myDefDisposeMethod() {
        System.out.println("DIE! DIE! DIE!");
    }
}
