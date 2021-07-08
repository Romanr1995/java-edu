package com.metanit.java8;

import com.metanit.zadaniya.ConverterInArabic2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.metanit.zadaniya.ConverterInArabic2.convertFromArabicToRoman;

public class Demo2 {
    public static void main(String[] args) {
        IntFunctionInterface obj = val -> System.out.println(val);

        IntFunctionInterface obj2 = new IntFunctionInterface() {//'equivalent' to obj
            @Override
            public void process(int val) {
                System.out.println(val);
            }
        };

        obj.process(42);

        System.out.println("-".repeat(80));

        obj.process(88);

        Runnable runnable = () -> System.out.println("Hello!");

        runnable.run();

        Consumer<String> consumer = s -> System.out.println("s=" + s);

        consumer.accept("Foo");

        Supplier<String> supplier = () -> "Hello";

        System.out.println("supplier.get() = " + supplier.get());

        System.out.println("------------------------------------------------------------------------");

        Predicate<String> startsWithA = s -> s != null && !s.isEmpty() && s.charAt(0) == 'A';

        List<String> words = Arrays.asList("Abba", "Plane", "Bird", "apple", "Apple", "Computer");

        printAllAllowedWords(words, startsWithA);

        System.out.println("------------------------------------------------------------------------");

        printAllAllowedWords(
                words,
                s -> s.length() == 4
        );

        System.out.println("------------------------------------------------------------------------");

        printConvertedNumbers(
                ConverterInArabic2::convertFromArabicToRoman,//i -> ConverterInArabic2.convertFromArabicToRoman(i)
                1, 2, 4, 42, 100, 101
        );

        System.out.println("------------------------------------------------------------------------");

        printConvertedNumbers(
                Integer::toHexString,//i -> Integer.toHexString(i),
                1, 2, 4, 42, 100, 101
        );
    }

    public static void printAllAllowedWords(List<String> words, Predicate<String> filter) {
        for (String word : words) {
            if (filter.test(word)) {
                System.out.println(word);
            }
        }
    }

    public static void printConvertedNumbers(Function<Integer, String> converter, int... numbers) {
        for (int number : numbers) {
            String s = converter.apply(number);
            System.out.println(s);
        }
    }

    @FunctionalInterface
    static interface IntFunctionInterface {
        void process(int val);
    }
}
