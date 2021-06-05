package com.metanit.classes.inheritance;

public class Box {
    private double l;
    private double h;
    private double w;

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double volume() {
        return h * l * w;
    }
}
