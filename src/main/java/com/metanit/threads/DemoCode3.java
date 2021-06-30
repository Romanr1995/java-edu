package com.metanit.threads;

public class DemoCode3 {
    static final Object mutex = new Object();

    public static void main(String[] args) throws InterruptedException {


        DataHolder dataHolder = new DataHolder(4, 5, 10);
        //нужно создать два потока которые прибавят n раз значение x к dataHolder.data с использованием mutex
        Thread t1 = new Thread(dataHolder);
        Thread t2 = new Thread(dataHolder);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("summa = " + dataHolder.summa);

    }

    static class DataHolder implements Runnable {
        int data = 0;
        int x;
        int n;
        int summa;

        public DataHolder(int data, int x, int n) {
            this.data = data;
            this.x = x;
            this.n = n;
        }

        public DataHolder(int data) {
            this.data = data;
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                synchronized (mutex) {
                    summa += x;
                }
            }
        }
    }
}
