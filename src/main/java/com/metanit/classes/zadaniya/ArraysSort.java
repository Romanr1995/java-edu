package com.metanit.classes.zadaniya;

public class ArraysSort {
    public static void main(String[] args) {
        int[] a = {1,74,24};
        int[] b = arraySort(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static int[] arraySort(int[] arr) {
        int[] res = new int[arr.length];
        int a = 0;

            while (a < res.length/2) {
                for (int i = 0; i < arr.length; i+=2) {
                res[a] = arr[i];
                a++;
            }
        }
        while (a < res.length) {
            for (int i = 1; i < arr.length; i+=2) {
                res[a] = arr[i];
                a++;
            }
        }
        return res;
    }
}
