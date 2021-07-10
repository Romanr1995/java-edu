package com.metanit.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DemoCode1 {

    public static final int SIZE = 10_000;

    public static void main(String[] args) {
        List<Double> doubles = generateDoubles();

        //filter values between 1000 and 1_000_000
        List<Double> doubles1 = doubles.stream()
                .filter(d -> d >= 1000 && d <= 1_000_000)
                .collect(Collectors.toList());

        System.out.println(doubles1);


        doubles1.sort(Comparator.naturalOrder());

        System.out.println(doubles1);
    }

    static List<Double> generateDoubles() {
        Random r = new Random();

        return r.doubles(SIZE).map(d -> d * 100_000_000)
                .boxed().collect(Collectors.toList());
    }
}
