package com.javabrains;

public class Triangle {
    private Point poinA, poinB, poinC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.poinA = pointA;
        this.poinB = pointB;
        this.poinC = pointC;
    }

//
//    public Point getPointA() {
//        return pointA;
//    }
//
//
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }


    @Override
    public String toString() {
        return "Triangle{" +
                "\npointA=" + poinA +
                "\npointB=" + poinB +
                "\npointC=" + poinC +
                "\n}";
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
