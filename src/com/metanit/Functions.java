package com.metanit;
import static com.metanit.ArraysStats.avgOfArray;
import static java.lang.Math.sqrt;

public class Functions {
    public static void main(String[] args) {
        int[] b = Arrays.generate(1000);
        int min = minOfArray(b);
        int max = maxOfArray(b);
        double variance = varianceOfArray(b);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double varianceOfArray(int[] arr) {
        double avg = avgOfArray(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] - avg) * (arr[i] - avg);
        }
        return sqrt((double) sum / arr.length);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}