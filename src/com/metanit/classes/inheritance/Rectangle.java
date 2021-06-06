package com.metanit.classes.inheritance;

public class Rectangle  extends Quadrilateral {

    public Rectangle (double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    public void square() {
        System.out.println("Площаль прямоугольника = " + getA() * getB());
    }

}
