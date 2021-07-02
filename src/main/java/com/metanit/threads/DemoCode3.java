package com.metanit.threads;

public class DemoCode3 {
    static final Object mutex = new Object();

    public static void main(String[] args) throws InterruptedException {


        DataHolder dataHolder = new DataHolder(0);
        //нужно создать два потока которые прибавят n раз значение x к dataHolder.data с использованием mutex
        Thread t1 = new Thread(new Incrementor(400_000, 10, dataHolder));
        Thread t2 = new Thread(new Incrementor(500_000, 8, dataHolder));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("summa = " + dataHolder.data);

    }

    static class DataHolder {
        int data = 0;

        public DataHolder(int data) {
            this.data = data;
        }
    }

    static class Incrementor implements Runnable {
        final int n;
        final int x;
        DataHolder dataHolder;

        public Incrementor(int n, int x, DataHolder dataHolder) {
            this.n = n;
            this.x = x;
            this.dataHolder = dataHolder;
        }

        @Override
        public void run() {
            for (int i = 0; i < n; ++i) {
                synchronized (mutex) {
                    dataHolder.data += x;
                }
            }
        }
    }
}
