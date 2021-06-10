package com.metanit.classes;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Point x, Point y, Point z) {
        a = x.distanceTo(y);
        b = y.distanceTo(z);
        c = z.distanceTo(x);
    }

//    public double square() {
//        double p = perimeter();
//        return sqrt(0,5*p*(p - a)*(p - b)*(p - c));
//    }

    public double perimeter() {
        return a + b + c;
    }

    /**
     * является равнобедренным
     */
    public boolean isIsosceles() {
//        if (a == b || a == c || b == c){
//            return true;
//        }
//        return false;
        return a == b || a == c || b == c;
    }

    /**
     * является равносторонним
     */
    public boolean isEquilateral() {
        return a == b && b == c;
    }


}
