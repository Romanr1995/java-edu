package com.metanit.classes.inheritance;

public class Quadrate extends Rectangle {

    public Quadrate(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    public void square() {
        System.out.println("Площадь квадрата = " + Math.pow(getA(),2));
    }
}
