package com.metanit.collect;

import java.util.Iterator;

public class LList implements Iterable<String> {
    private int size;
    private Node head;

    private static class Node {
        String data;
        Node nodeNext;

        Node(String  data_) {
            this.data = data_;
            this.nodeNext = null;
        }
    }


    public void addToBegin(String elem) {
       Node n1 = new Node(elem);
        //скорость выполнения не должна зависеть от размера связного списка
    }

    public void addToEnd(String elem) {

    }

    public int size() {
        return size;
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
