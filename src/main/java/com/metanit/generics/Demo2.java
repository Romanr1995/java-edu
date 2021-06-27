package com.metanit.generics;

import java.math.BigInteger;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double d = 3.14;
        double x = 2.78;
        BigInteger bi = new BigInteger("1000000000000");

        printSum(a,b);
        printSum(d, x);

        printSum(a, d);

        printSum(a, bi);
    }

    public static <E extends Number> void printSum(E lhs, E rhs) {
        System.out.println("sum = " + (lhs.doubleValue() + rhs.doubleValue()));
    }
}
