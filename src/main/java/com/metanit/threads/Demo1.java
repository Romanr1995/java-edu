package com.metanit.threads;

public class Demo1 {
    static final int COUNT = 10_000;
    static int val = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();//запускает поток
        t2.start();

        t1.join();//главный поток ждет завершения потока t1
        t2.join();

        System.out.println("val = " + val);
    }

    static class MyRunnable implements Runnable  {
        @Override
        public void run() {
            for (int i = 0; i < COUNT; i++) {
                val++;
            }
        }
    }
}
