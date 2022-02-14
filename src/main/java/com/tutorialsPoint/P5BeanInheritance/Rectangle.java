package com.tutorialsPoint.P5BeanInheritance;

public class Rectangle extends Polygon {
    private Point pointD;

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\npointA=" + pointA +
                ",\npointB=" + pointB +
                ",\npointC=" + pointC +
                ",\npointD=" + pointD +
                '}';
    }
}
