package com.tutorialsPoint.P5BeanInheritance;

public class Polygon {
    Point pointA;
    Point pointB;
    Point pointC;

    @Override
    public String toString() {
        return "Polygon{" +
                "\npointA=" + pointA +
                ",\npointB=" + pointB +
                ",\npointC=" + pointC +
                '}';
    }

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
}
