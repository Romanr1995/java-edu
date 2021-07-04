package com.metanit;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] strings = {"foo", "bar", "jar", "java", "test"};

        Arrays.sort(strings);

//        String[] res;
//        for (int i = 0; i < strings.length; i++) {
//            res[i+1] = Rand
//        }
    }


    public static void shuffle(int[] arr) {
        Random random = new Random();

        for (int x = 0; x < arr.length * 2; x++) {
            int i = random.nextInt(arr.length);
            int j = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
