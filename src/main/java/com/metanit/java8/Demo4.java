package com.metanit.java8;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Character> list = r.ints()//Stream<int>
                .limit(10_000)
                .map(i -> i % 26)
                .boxed()//Stream<Integer>
                .map(Demo4::getCharByNumber)//Stream<Character>
                .collect(Collectors.toList());

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }

    /**
     *
     * @param num 0 ... 25
     */
    static char getCharByNumber(int num) {
        return (char)('A' + num);
    }
}
