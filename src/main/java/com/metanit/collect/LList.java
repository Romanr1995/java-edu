package com.metanit.collect;

import java.util.Iterator;

public class LList implements Iterable<String> {

    private static class Node {
        //добавь необходимые поля!
    }


    public void addToBegin(String elem) {
        //скорость выполнения не должна зависеть от размера связного списка
    }

    public void addToEnd(String elem) {

    }

    public int size() {
        //скорость выполнения не должна зависеть от размера связного списка
        return 0;
    }

    @Override
    public Iterator<String> iterator() {
        //факультативно
        return null;
    }

    private class MyIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }
}
