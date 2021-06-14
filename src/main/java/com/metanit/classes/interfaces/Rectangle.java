package com.metanit.classes.interfaces;

public class Rectangle implements Comparable<Rectangle> {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double square() {
        return this.a * this.b;
    }

    public double perimetr() {
        return 2 * (this.a + this.b);
    }

    @Override
    public int compareTo(Rectangle two) {
        if (this.square() != two.square() && this.a > 0 && this.b > 0 && two.a > 0 && two.b > 0) {
            if (this.square() > two.square()) {
                return 1;
            } else if (this.square() < two.square()) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.square() == two.square() && this.a > 0 && this.b > 0 && two.a > 0 && two.b > 0){
            if (this.perimetr() > two.perimetr()) {
                return 1;
            } else if (this.perimetr() < two.perimetr()) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
