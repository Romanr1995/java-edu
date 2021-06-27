package com.metanit.generics;

import java.util.Iterator;

public class DynamicArray<E> implements Iterable<E> {
    private Object[] data;
    private int size;

    public DynamicArray() {
        data = new Object[0];
        size = 0;
    }

    public void add(E e){
        if (data.length == size) {
            int newCapacity;// data.length > 0 ? data.length * 2 : 1

            if (data.length > 0) {
                newCapacity = data.length * 2;
            } else {
                newCapacity = 1;
            }

            Object[] temp = new Object[newCapacity];

            for (int i = 0; i < data.length; ++i) {
                temp[i] = data[i];
            }

            data = temp;
        }

        data[size++] = e;
    }

    public int size() {
        return size;
    }

    public E get(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException("Incorrect index " + idx + " for size " + size);
        }

        return (E) data[idx];
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
        int curIdx = 0;

        @Override
        public E next() {
            return (E) data[curIdx++];
        }

        @Override
        public boolean hasNext() {
            return curIdx < size;
        }
    }
}
