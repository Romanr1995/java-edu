package com.metanit.collect;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class LListTest {

    @Test
    public void testAddToBegin() {
        LList list = new LList();

        list.addToBegin("foo");
        list.addToBegin("bar");

        assert list.size() == 2;
    }

    @Test
    public void testAddToEnd() {
        LList list = new LList();

        list.addToEnd("foo");
        list.addToEnd("bar");

        assert list.size() == 2;
    }

    @Test
    public void testIteration() {
        LList list = new LList();
        list.addToBegin("foo");
        list.addToBegin("bar");

        Iterator<String> it = list.iterator();

        assert it.hasNext();

        assertEquals("bar", it.next());
        assertEquals("foo", it.next());
    }

    @Test
    public void testIteration2() {
        LList list = new LList();
        list.addToEnd("foo");
        list.addToEnd("bar");

        Iterator<String> it = list.iterator();

        assert it.hasNext();

        assertEquals("foo", it.next());
        assertEquals("bar", it.next());
    }

}