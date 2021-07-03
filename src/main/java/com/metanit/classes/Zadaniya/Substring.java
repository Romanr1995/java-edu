package com.metanit.classes.Zadaniya;

public class Substring {
    public static void main(String[] args) {
        searchSubstring("ababbababa", "aba");
    }

    public static void searchSubstring(String S, String T) {
        int n = 0;
        int c = -1;

         for (int i = 0; i < S.length(); i++) {
                n = S.indexOf(T, ++c);
                c = n;
                if (n < 0) {
                    break;
                }
                System.out.print(n + " ");
        }
    }
}

