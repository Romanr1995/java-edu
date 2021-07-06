package com.metanit.hackerrank;

import org.junit.jupiter.api.Test;

import static com.metanit.hackerrank.Result_.timeInWords;
import static org.junit.jupiter.api.Assertions.*;

class TimeInWordsTest {

    @Test
    public void test500() {
        assertEquals("five o' clock", timeInWords(5,0));
    }

    @Test
    public void test501() {
        assertEquals("one minute past five", timeInWords(5, 1));
    }

    @Test
    public void test510() {
        assertEquals("ten minutes past five", timeInWords(5, 10));
    }

    @Test
    public void test515() {
        assertEquals("quarter past five", timeInWords(5, 15));
    }

    @Test
    public void test530() {
        assertEquals("half past five", timeInWords(5,30));
    }

    @Test
    public void test540() {
        assertEquals("twenty minutes to six", timeInWords(5,40));
    }

    @Test
    public void test545() {
        assertEquals("quarter to six", timeInWords(5,45));
    }

    @Test
    public void test547() {
        assertEquals("thirteen minutes to six", timeInWords(5,47));
    }

    @Test
    public void test528() {
        assertEquals("twenty eight minutes past five", timeInWords(5,28));
    }

    @Test
    public void test1231() {
        assertEquals("twenty nine minutes to one", timeInWords(12, 31));
    }
}