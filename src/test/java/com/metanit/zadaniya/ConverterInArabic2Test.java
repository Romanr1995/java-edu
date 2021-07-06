package com.metanit.zadaniya;

import org.junit.jupiter.api.Test;

import static com.metanit.zadaniya.ConverterInArabic2.convertFromArabicToRoman;
import static org.junit.jupiter.api.Assertions.*;

class ConverterInArabic2Test {

    @Test
    public void test1() {
        assertEquals("I", convertFromArabicToRoman(1));
    }

    @Test
    public void test2() {
        assertEquals("II", convertFromArabicToRoman(2));
    }

    @Test
    public void test10() {
        assertEquals("X", convertFromArabicToRoman(10));
    }

    @Test
    public void test3999() {
        assertEquals("MMMCMXCIX", convertFromArabicToRoman(3999));
    }

    @Test
    public void test525() {
        assertEquals("DXXV", convertFromArabicToRoman(525));
    }

}