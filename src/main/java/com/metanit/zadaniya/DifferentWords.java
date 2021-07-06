package com.metanit.zadaniya;

import java.util.TreeSet;

public class DifferentWords {

    public static void main(String[] args) {
        System.out.println(searchForWords("aaa"));
    }

    public static int searchForWords(String word) {

        TreeSet<String> substrings = new TreeSet<>();

        for (int i = 0; i < word.length(); i++) {
            String word1 = word.substring(i);
            for (int k = 1; k <= word1.length(); k++) {
                substrings.add(word1.substring(0,k));
            }
           }
        return substrings.size();
        }
    }

