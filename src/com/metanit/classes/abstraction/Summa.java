package com.metanit.classes.abstraction;

public class Summa extends BinaryOperation{

    @Override
    public double apply(double Ihs, double rhs) {
        return Ihs + rhs;
    }
}
