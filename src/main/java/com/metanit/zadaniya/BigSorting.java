package com.metanit.zadaniya;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

public class BigSorting {

    public static void main(String[] args) {

        List<String> arr= new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("100");
        arr.add("12303479849857341718340192371");
        arr.add("3084193741082937");
        arr.add("3084193741082938");
        arr.add("111");
        arr.add("200");

        System.out.println(bigSorting(arr));
    }

    public static List<String> bigSorting(List<String> unsorted) {
        Comparator<String> comp = (lhs, rhs) -> {
            if (lhs.length() != rhs.length()) {
                return Integer.compare(lhs.length(), rhs.length());
            }

            return lhs.compareTo(rhs);
        };

        unsorted.sort(comp);
        //unsorted.sort(comparing(String::length).thenComparing(naturalOrder()));//то же самое что и выше!

        return unsorted;
    }


    public static <T> void bubbleSort(List<T> list, Comparator<T> cmp) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                //if (list.get(j) > list.get(j+1)) {
                if (cmp.compare(list.get(j), list.get(j+1)) > 0) {
                    T temp = list.get(j);

                    list.set(j, list.get(j+1));

                    list.set(j+1, temp);
                }
            }
        }
    }


    public static void bubbleSort(List<Integer> ints) {
        for (int i = 0; i < ints.size() - 1; i++) {
            for (int j = 0; j < ints.size() - i - 1; j++) {
                if (ints.get(j) > ints.get(j+1)) {
                    int temp = ints.get(j);

                    ints.set(j, ints.get(j+1));

                    ints.set(j+1, temp);
                }
            }
        }
    }
}
