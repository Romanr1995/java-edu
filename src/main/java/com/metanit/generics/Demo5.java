package com.metanit.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Demo5 {
    public static void main(String[] args) {
        List<Double> doubles = asList(Math.PI, 12.0, 41.666, 42.0, 45.0);
        List<Long> longs = asList(42L, 14L, 101L, 1454547L);
        List<BigDecimal> decimals = asList(new BigDecimal("499.99"), new BigDecimal("15.664"));

        List<BigDecimal> union = union(asList(doubles, longs, decimals));

        System.out.println(union);

    }


    public static List<BigDecimal> union(List<List<? extends Number>> listOfLists) {
        List<BigDecimal> result = new ArrayList<>();

        for (List<? extends Number> list : listOfLists) {
            for (Number num : list) {
                result.add(
                        new BigDecimal(num.doubleValue())
                );
            }
        }

        return result;
    }
}
