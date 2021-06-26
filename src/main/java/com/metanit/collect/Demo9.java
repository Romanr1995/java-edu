package com.metanit.collect;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        //java.util.ArrayList, java.util.HashSet, java.util.TreeSet
        List<Integer> integers = new ArrayList<>();

        Set<String> s1 = new TreeSet<>();
        SortedSet<String> sss2 = new TreeSet<>();
        NavigableSet<String> ss1 = new TreeSet<>();


        Set<String> s2 = new HashSet<>();
        //SortedSet<String> ss2 = new HashSet<>(); won't compile!

        Collection<Double> doubles = new ArrayList<>();

        doubles.add(10.0);
        System.out.println("doubles.contains(13.1) = " + doubles.contains(13.1));
        System.out.println("doubles.size() = " + doubles.size());
    }


    public static  <E extends Object, S extends Comparable<S>> List<E> compute(Set<S> set) {
        ///////

        return new ArrayList<>();
    }
}
