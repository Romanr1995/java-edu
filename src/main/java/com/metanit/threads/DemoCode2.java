package com.metanit.threads;

public class DemoCode2 {
    //нужно выводить сообщение о текущем времени (System.currentTimeMillis()) в 3 разных потоках в течении 10 сек
    //сообщение от каждого потока должно быть в формате T#: <time>, где # - номер потока (0,1,2)
    //частота сообщения от каждого потока - не чаще чем 200мс
    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new Thread(new MyRunnable());
        Thread tr2 = new Thread(new MyRunnable());
        Thread tr3 = new Thread(new MyRunnable());


    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }
}
