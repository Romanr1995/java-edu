package com.metanit.threads;

import java.util.Random;

public class DemoCode1 {
    static final int SIZE = 10_000_000;

    public static void main(String[] args) {
        //нужно посчитать сумму этого массива в 2 потоках!
    }

    public static int[] randomArray() {
        Random r = new Random();
        int[] result = new int[SIZE];

        for (int i = 0; i < result.length; i++) {
            result[i] = r.nextInt(Integer.MAX_VALUE);
        }
        return result;
    }
}
