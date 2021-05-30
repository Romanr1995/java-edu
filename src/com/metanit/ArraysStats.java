package com.metanit;

import static java.lang.Math.sqrt;

public class ArraysStats {
    public static void main(String[] args) {
        int[] a = Arrays.generate(1000);

        long sum = sumOfArray(a);
        double avg = avgOfArray (a);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }

    public static long sumOfArray(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];//sum = a[i] + sum;
        }
        return sum;
    }

    //|{1,2,3,4}| == 2.5
    public static double avgOfArray(int [] arre) {
       double avg = (double) sumOfArray(arre) / arre.length;
       return avg;
    }
}
