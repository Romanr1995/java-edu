package com.metanit.collect;

import java.util.Iterator;

public class LList implements Iterable<String> {
    private int size;
    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addToBegin(String elem) {
        //скорость выполнения не должна зависеть от размера связного списка
        Node n1 = new Node(elem);
        n1.next = head;
        head = n1;
        size++;
    }

    public void addToEnd(String elem) {
        Node cur = head;

        size++;

        if (head == null) {
            head = new Node(elem);
            return;
        }

        //O(n)
        while(cur.next != null) {
            cur = cur.next;
        }
        //после этого цикла cur указывает на последний узел связного списка

        cur.next = new Node(elem);

    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<String> iterator() {
        //факультативно
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null && cur.next != null;
        }

        @Override
        public String next() {
            String data = cur.data;
            cur = cur.next;
            return data;
        }
    }
}
