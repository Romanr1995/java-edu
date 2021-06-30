package com.metanit.threads;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Demo2 {
    static CountDownLatch cdl = new CountDownLatch(1);
    static final Object mutex = new Object();

    public static void main(String[] args) throws Exception {
        final int size = 1_000_000;
        int[] totalScores = new int[size];

        int[] mathScores = new int[size];
        Arrays.fill(mathScores, 1);//[1,1,1,1...]

        int[] physicsScores = new int[size];
        Arrays.fill(physicsScores, 1);//[1,1,1,1...]

        Thread t1 = new Thread(new ScoreAdder(totalScores, mathScores));
        Thread t2 = new Thread(new ScoreAdder(totalScores, physicsScores));

        t1.start();
        t2.start();

        cdl.countDown();

        t1.join();
        t2.join();

        for (int i = 0; i < totalScores.length; ++i) {
            if (totalScores[i] != 2) {
                throw new RuntimeException("found wrong value: " + i);
            }
        }

        System.out.println("OK!");

    }


    static class ScoreAdder implements Runnable {
        int[] totalScores;
        int[] scoresToAdd;

        public ScoreAdder(int[] totalScores, int[] scoresToAdd) {
            this.totalScores = totalScores;
            this.scoresToAdd = scoresToAdd;
        }

        @Override
        public void run() {
            try {
                cdl.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //mutex mutual exclusion
            for (int i = 0; i < totalScores.length; i++) {
                synchronized (mutex) {
                    totalScores[i] += scoresToAdd[i];
                }
            }
        }
    }
}
