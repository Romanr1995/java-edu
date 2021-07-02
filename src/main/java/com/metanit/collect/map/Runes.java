package com.metanit.collect.map;

import java.util.ArrayList;
import java.util.List;

public class Runes {
    public static void main(String[] args) {
        List<String> runes = splitIntoRunes("foolTset");

        for (String rune : runes) {
            if (!checkRune(rune)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }


    public static List<String> splitIntoRunes(String word) {
        List<String> runes = new ArrayList<>();
        int prev = 0;

        for (int i = 1; i <= word.length(); i++) {
            if (i == word.length() || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                String rune = word.substring(prev, i);
                runes.add(rune);
                prev = i;
            }
        }

        return runes;
    }

    public static boolean checkRune(String rune) {
        if (rune.length() > 4 || rune.length() < 2) {
            return false;
        }

        char firstLetter = rune.charAt(0);
        if (firstLetter < 'A' || firstLetter > 'Z') {
            return false;
        }

        for (int i = 1; i < rune.length(); i++) {
            if (rune.charAt(i) < 'a' || rune.charAt(i) > 'z') {
                return false;
            }
        }

        return true;
    }



}
