package com.metanit.collect;

import java.util.Iterator;

public class DynamicArray implements Iterable<String> {
    private String[] data;
    private int size;

    public DynamicArray() {
        data = new String[0];
        size = 0;
    }

    public void add(String elem) {
        if (data.length == size) {
            int newCapacity;// data.length > 0 ? data.length * 2 : 1

            if (data.length > 0) {
                newCapacity = data.length * 2;
            } else {
                newCapacity = 1;
            }

            String[] temp = new String[newCapacity];

            for (int i = 0; i < data.length; ++i) {
                temp[i] = data[i];
            }

            data = temp;
        }

        data[size] = elem;
        size++;
    }

    public int size() {
        return size;
    }

    public String get(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Incorrect index " + idx + " for size " + size);
        }

        return data[idx];
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        int curIdx = 0;

        @Override
        public String next() {
            return data[curIdx++];
        }

        @Override
        public boolean hasNext() {
            return curIdx < size;
        }
    }
}
