package com.metanit.zadaniya;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ConverterInRoman {

    public static void main(String[] args) {
      converterToRomanNumbersTo1000("X");
    }

    public static void converterToRomanNumbersTo1000(String number) {
        Map<String, Integer> m = new TreeMap<>();

        for (int i = 1; i <= 1000; i++) {
            m.put(ConverterInArabic2.converterToArabicNumbersTo1000(i), i);
        }
        for (Map.Entry<String, Integer> e : m.entrySet()) {

            String key = e.getKey();
            int value = e.getValue();

            System.out.println("key = " + key + "value = " + value);
        }
    }
}
