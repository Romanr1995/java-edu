package com.metanit.collect.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Long> numbers = new HashMap<>();

        Long oldValue = numbers.put("один", 1L);
        numbers.put("три", 3L);
        numbers.put("пять", 5L);

        System.out.println("numbers.containsKey(\"два\") = " + numbers.containsKey("два"));
        System.out.println("numbers.containsKey(\"пять\") = " + numbers.containsKey("пять"));

        System.out.println("numbers.get(\"один\") = " + numbers.get("один"));

        oldValue = numbers.put("один", 10L);

        System.out.println("numbers.get(\"один\") = " + numbers.get("один"));

        for (Map.Entry<String, Long> e : numbers.entrySet()) {
            String key = e.getKey();
            Long value = e.getValue();

            System.out.println("key = " + key + " value = " + value);
        }

    }
}
