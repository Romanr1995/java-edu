package com.metanit.classes;
import com.metanit.classes.Point;

import static java.lang.Math.sqrt;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Triangle(Point x, Point y, Point z) {

        double a = sqrt((x.getX() - y.getX()) * (x.getX() + y.getX()) +
                (x.getY() - y.getY()) * (x.getY() - y.getY()));
        double b = sqrt((y.getX() - z.getX()) * (y.getX() + z.getX()) +
                (y.getY() - z.getY()) * (y.getY() - z.getY()));
        double c = sqrt((x.getX() - z.getX()) * (x.getX() + z.getX()) +
                (x.getY() - z.getY()) * (x.getY() - z.getY()));

        return a;

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
     *
     * является равносторонним
     */
    public boolean isEquilateral() {
        return a == b && a == b && b ==c;
    }


}
