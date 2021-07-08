package com.metanit.zadaniya;


import java.util.*;

public class ConverterInRoman {

    public static void main(String[] args) {
        System.out.println(converterToRomanNumbersTo1000("X"));
    }

    public static int converterToRomanNumbersTo1000(String number) {
        Map<String, Integer> m = new TreeMap<>();

        for (int i = 1; i <= 1000; i++) {
            try {
                m.put(ConverterInArabic2.convertFromArabicToRoman(i), i);
            }catch (RuntimeException e) {
                throw new RuntimeException("number = " + i, e);
            }
        }
        int value = m.get(number);
        for (Map.Entry<String, Integer> e : m.entrySet()) {

            String key = e.getKey();
            value = e.getValue();
//            System.out.println("key = " + key + "value = " + value);
        }
        return value;
    }
}
