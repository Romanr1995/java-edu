package com.metanit.threads;

import java.util.Arrays;
import java.util.Random;

public class DemoCode1 {
    static final int SIZE = 10_000_000;


    public static void main(String[] args) throws InterruptedException {
        int[] arr = randomArray();
        long[] sum0 = new long[1];
        long[] sum1 = new long[1];

        Thread tr1 = new Thread(new MyRunnable(arr, 0, arr.length/2, sum0));
        Thread tr2 = new Thread(new MyRunnable(arr, arr.length/2, arr.length, sum1));

        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println("Summa = " + (sum0[0] + sum1[0]));

        System.out.println("sum 1 thread " + Arrays.stream(arr).asLongStream().sum());

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

    static class MyRunnable implements Runnable  {
        int[] arr;
        int start;
        int end;
        long[] sumOut;

        public MyRunnable(int[] arr, int start, int end, long[] sumOut) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.sumOut = sumOut;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = start; i < end; ++i) {
                sum += arr[i];
            }
            sumOut[0] = sum;
        }
    }
}
