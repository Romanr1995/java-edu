package com.metanit;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int [] a = {2,3,7,12,15};
        int [] b = new int[1000];


        for (int i = 0; i < a.length ; i++ ){
            System.out.println(a[i] );
        }

        for (int k = 0; k < b.length ; k++ ){
            b[k] = -500 + k ;
            System.out.println(b[k]);
        }
    }

    public static int[] generate(int size) {
        int[] ints = new int[size];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1_000_000);
        }
        return ints;
    }

    static class MinMax {
        public final int min;
        public final int max;

        public MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static MinMax findMinMaxElement(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        MinMax minMax = new MinMax(min,max);
        return minMax;
    }
}
