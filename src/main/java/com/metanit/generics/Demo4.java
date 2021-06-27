package com.metanit.generics;

public class Demo4 {
    public static void main(String[] args) {
        NumberHolder<Integer> i = new NumberHolder<>(42);
        NumberHolder<Double> d = new NumberHolder<>(Math.PI);
        NumberHolder<Long> l = new NumberHolder<>(420L);

        System.out.println("i.isLessThan(d) = " + i.isLessThan(d));

    }
}
