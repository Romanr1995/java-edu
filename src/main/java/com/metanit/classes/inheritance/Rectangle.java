package com.metanit.classes.inheritance;

public class Rectangle  extends Quadrilateral {

    public Rectangle (double a, double b) {
        super(a, b, a, b);
    }

    public double square() {
        return getA() * getB();
    }
}
