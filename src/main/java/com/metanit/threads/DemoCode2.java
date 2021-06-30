package com.metanit.threads;

public class DemoCode2 {
    //нужно выводить сообщение о текущем времени (System.currentTimeMillis()) в 3 разных потоках в течении 10 сек
    //сообщение от каждого потока должно быть в формате T#: <time>, где # - номер потока (0,1,2)
    //частота сообщения от каждого потока - не чаще чем 200мс
    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new Thread(new MyRunnable(0));
        Thread tr2 = new Thread(new MyRunnable(1));
        Thread tr3 = new Thread(new MyRunnable(2));

        tr1.start();
        tr2.start();
        tr3.start();

        tr1.join();
        tr2.join();
        tr3.join();



    }

    static class MyRunnable implements Runnable {
       public int number;

        public MyRunnable(int number) {
            this.number = number;
        }

        @Override
        public void run() {

            for (long begin = System.currentTimeMillis(); (begin <= begin+10000); begin += 200) {
                System.out.println("T" + number + " "+ System.currentTimeMillis());
            }
        }
    }
}
