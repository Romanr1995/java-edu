package com.metanit.collect;

public class DynamicArray {
    private String[] data;

    public DynamicArray() {
        data = new String[0];
    }

    public void add(String elem) {
        String[] temp = new String[data.length + 1];

        for (int i = 0; i < data.length; ++i) {
            temp[i] = data[i];
        }

        data = temp;

        data[data.length - 1] = elem;
    }

    public int size() {
        return data.length;
    }

    public String get(int idx) {
        return data[idx];
    }
}
