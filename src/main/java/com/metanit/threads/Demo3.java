package com.metanit.threads;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    private static final Object MUTEX = new Object();

    public static void main(String[] args) throws Exception {
        List<String> messages = new ArrayList<>();

        List<Thread> producers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            producers.add(
                    new Thread(new Producer(messages))
            );
        }

        Thread consumerThread = new Thread(new Consumer(messages));

        consumerThread.start();

        for (Thread producer : producers) {
            producer.start();
        }

        consumerThread.join();
        System.out.println("main ended!");
    }


    static class Producer implements Runnable {
        final List<String> messages;

        public Producer(List<String> messages) {
            this.messages = messages;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (MUTEX) {
                    messages.add("hello!");
                }

                /*try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        }
    }

    static class Consumer implements Runnable {
        final List<String> messages;

        public Consumer(List<String> messages) {
            this.messages = messages;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (MUTEX) {
                    if (!messages.isEmpty()) {
                        //System.out.println(messages.get(0));
                        messages.remove(0);
                    }
                }

                /*try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        }
    }
}
