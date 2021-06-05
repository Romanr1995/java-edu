package com.metanit.classes.inheritance;

public class WeightedBox extends Box {
    private double weight;

    public WeightedBox(double l, double h, double w, double weight) {
        super(l, h, w);//Box(l,h,w)

        this.weight = weight;
    }


    public double density() {
        return weight / volume();
    }
}
