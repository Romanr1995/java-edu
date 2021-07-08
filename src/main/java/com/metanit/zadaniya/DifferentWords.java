package com.metanit.zadaniya;

import java.util.TreeSet;

public class DifferentWords {

    public static void main(String[] args) {
        System.out.println(searchForWords("aaa"));
    }

    public static int searchForWords(String word) {

        TreeSet<String> substrings = new TreeSet<>();

        for (int i = 0; i < word.length(); i++) {
            String wordToIndex = word.substring(i);
            for (int k = 1; k <= wordToIndex.length(); k++) {
                substrings.add(wordToIndex.substring(0,k));
            }
           }
        return substrings.size();
        }
    }

