package com.metanit.threads;

public class DemoCode3 {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();
        //нужно создать два потока которые прибавят n раз значение x к dataHolder.data с использованием mutex
    }

    static class DataHolder {
        int data = 0;
    }
}
