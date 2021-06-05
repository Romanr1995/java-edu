package com.metanit.classes;

public class Circle {
    private double r;

    Circle(double r_) {
        r = r_;
    }

    double square() {
        return Math.PI * r * r;
    }

    double circumference() {
        return Math.PI * 2 * r;
    }

    public double getR() {
        return r;
    }
}
