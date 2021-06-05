package com.metanit.classes;
import static java.lang.Math.sqrt;

/**
 * точка на плоскости
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

}

