package com.metanit.exceptions;

import java.io.FileNotFoundException;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        } catch (ArithmeticException e) {
            System.out.println("also error");
        }

        try {
            generateException();
        } catch (RuntimeException e) {
            System.out.println("error");
        }

        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        } catch (RuntimeException e) {
            System.out.println("also error");
        }

        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("error");
        }

        System.out.println("!!!");

    }

    public static void generateException() {
        Random r = new Random();
        if (r.nextBoolean()) {
            int zero = 0;
            int i = 10 / zero;
        } else {
            int[] x = new int[0];
            x[0] = 1;
        }
    }
}
