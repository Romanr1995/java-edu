package com.metanit.threads;

import java.math.BigInteger;
import java.util.Random;

public class DemoCode1 {
    static final int SIZE = 10_000_000;
    static long l = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new Thread(new MyRunnable());
        Thread tr2 = new Thread(new MyRunnable());

        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println("Summa = " + l);


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

    public static long summ() {
        int[] arr = randomArray();
        long summa = 0;
        for(int i = 0; i < SIZE; i++) {
            summa+=arr[i];
        }
        return summa;
    }

    static class MyRunnable implements Runnable  {
        @Override
        public void run() {
            l = summ();
        }
    }
}
