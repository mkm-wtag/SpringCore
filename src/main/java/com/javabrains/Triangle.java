package com.javabrains;

public class Triangle implements Shape {
    private Point pointA, pointB, pointC;

    public Point getPointA() {
        return pointA;
    }



    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Coordinates of Triangle are");
        System.out.println("PointA is " + getPointA());
        System.out.println("PointB is " + getPointC());
        System.out.println("PointC is " + getPointC());
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing  init method called for Triangle.");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Die! Die! Die!");
//    }

    public void myInit() {
        System.out.println("Initialize  Triangle");
    }

    public void myDisposeMethod() {
        System.out.println("Destroying Triangle");
    }

}
