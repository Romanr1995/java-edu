package com.metanit.generics;

public class Demo1 {
    public static void main(String[] args) {
        DynamicArray<String> strings = new DynamicArray<>();

        strings.add("foo");
        strings.add("bar");

        System.out.println("strings.get(0) = " + strings.get(0));
        System.out.println("strings.get(1) = " + strings.get(1));

        DynamicArray<Double> doubles = new DynamicArray<>();

        doubles.add(10.01);
        doubles.add(11.01);
        doubles.add(10.61);

        double val1 = doubles.get(0);

        for (Double d : doubles) {
            System.out.println("d = " + d);
        }
    }
}
