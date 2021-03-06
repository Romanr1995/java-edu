package com.metanit.classes.inheritance;

public class Quadrilateral {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double perimeter() {
        return a + b + c + d;
    }
}
