package com.metanit.collect;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Demo10 {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();//LinkedList

        q.add("foo");//0(1)
        q.add("bar");
        q.add("xyz");

        System.out.println(q.poll());//0(1)
        System.out.println(q.poll());
        System.out.println(q.poll());

        Deque<String> dq = new ArrayDeque<>();

        dq.addLast("foo");
        dq.addFirst("bar");

        System.out.println("dq.pollFirst() = " + dq.pollFirst());
        System.out.println("dq.pollLast() = " + dq.pollLast());
    }
}
