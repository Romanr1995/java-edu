package com.metanit;

import java.util.Arrays;
import java.util.Random;

public class Arrays2 {
    public static void main(String[] args) {
        int[] a = new int[100_000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1_000_000);
        }

        int min = a[0];//Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);

        Arrays.sort(a);
        System.out.println("a[0] = " + a[0]);
    }

    //
}
