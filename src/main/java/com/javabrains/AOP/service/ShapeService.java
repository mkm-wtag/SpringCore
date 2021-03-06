package com.javabrains.AOP.service;

import com.javabrains.AOP.model.Circle;
import com.javabrains.AOP.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public String toString() {
        return "ShapeService{" +
                "\ncircle=" + circle +
                ",\ntriangle=" + triangle +
                "\n}";
    }
}
