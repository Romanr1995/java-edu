package com.metanit.java8;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                printFibonacciSequence();
            }
        };

        Thread t = new Thread(task);
        t.start();

        t.join();
    }

    public static void printFibonacciSequence() {
        long fPrev = 0;//F0
        long fCur = 1;//F1

        System.out.println(fPrev);

        System.out.println(fCur);

        while (true) {
            long fNew = fPrev + fCur;
            System.out.println(fNew);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            fPrev = fCur;
            fCur = fNew;
        }
    }
}
