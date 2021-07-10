package com.metanit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Foo", "Bar", "Qwe", "Test", "Яблоко","Ivantus", "Joystick", "Monitor",
                "Mouse", "Notebook");

        String val = list.stream()
                .filter(word -> word.length() > 4)
                .findFirst()
                .orElseGet(() -> "Default");
              //.orElse("Default");
              //.orElseThrow(() -> new RuntimeException("Ни одного значения не найдено!"));

        System.out.println("val = " + val);

        Optional<String> optS = list.stream()
                .filter(word -> word.length() > 5)
                .findAny();

        boolean f = list.stream()
                .filter(word -> word.length() % 2 == 0)
                .peek(word -> System.out.println(word))
                .allMatch(word -> word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');

        if (f) {
            System.out.println("Все слова начинаются на загл лат букву!");
        }
    }
}
