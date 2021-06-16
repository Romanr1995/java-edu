package com.metanit.exceptions;

import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        generateMyException();
        for (int i = 0; i < 100; i++) {
            int value = makeCalculations();
            checkCalculations(value);
        }
    }

    private static void generateMyException() {
        try {
            int zero = 0;
            int i = 10/zero;
        } catch (Exception e) {
            throw new MyException("error in generateMyException", e);
        }
    }

    private static void checkCalculations(int value) {
        if (value > 500) {
            //thrws MyException
            throw new MyException("Incorrect value " + value);
        }
    }

    private static int makeCalculations() {
        return new Random().nextInt(1000);
    }
}
