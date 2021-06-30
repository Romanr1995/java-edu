package com.metanit.threads;

import java.util.LinkedList;
import java.util.Queue;

public class Demo4 {
    static final int MSG_LIMIT = 100;
    static final int MIN_TO_READ = 10;
    static final long CONSUMER_PAUSE = 200;
    static final long PRODUCER_PAUSE = 100;

    static final Object MUTEX = new Object();

    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new LinkedList<>();

        Thread mon = new Thread(new Monitor(queue));
        mon.start();

        Thread t1 = new Thread(new Producer(queue));
        Thread t2 = new Thread(new Consumer(queue));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }


    static class Producer implements Runnable {
        final Queue<String> queue;
        int cnt = 0;

        public Producer(Queue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                if (queue.size() >= MSG_LIMIT) {

                    synchronized (MUTEX) {
                        MUTEX.notify();
                        try {
                            MUTEX.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                queue.add("hello = " + (cnt++));

                try {
                    Thread.sleep(PRODUCER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        final Queue<String> queue;

        public Consumer(Queue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                if (queue.size() <= MIN_TO_READ) {
                    synchronized (MUTEX) {
                        MUTEX.notify();
                        try {
                            MUTEX.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                String msg = queue.poll();
                System.out.println("msg = " + msg);

                try {
                    Thread.sleep(CONSUMER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Monitor implements Runnable {
        final Queue<String> queue;

        public Monitor(Queue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                System.err.println("Current queue size = " + queue.size());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
