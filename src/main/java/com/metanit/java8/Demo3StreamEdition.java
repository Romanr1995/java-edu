package com.metanit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo3StreamEdition {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList("Foo", "Bar", "Qwe", "Test", "Ivantus", "Joystick", "Monitor", "Mouse"); //->> List<Integer>

        List<Integer> numbers = new ArrayList<>();

        for (String word : words) {
            if (word.charAt(0) >= 'A' && word.charAt(0) <= 'M') {
                numbers.add(word.length());
            }
        }

        List<Integer> result = words.stream()//Stream<String>
                .filter(Demo3StreamEdition::betweenA_and_M)
//                .filter(word -> word.charAt(0) >= 'A' && word.charAt(0) <= 'M')//Stream<String>
                .map(word -> word.length())//Stream<Integer>
                .collect(Collectors.toList());

        System.out.println("numbers = " + numbers);

        System.out.println("result  = " + result);
    }


    static boolean betweenA_and_M(String s) {
        char first = s.charAt(0);
        return first >= 'A' && first <= 'M';
    }
}
