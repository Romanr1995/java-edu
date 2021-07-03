package com.metanit.classes.Zadaniya;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ryghhgyr";
        System.out.println(isPalindrome(str));
    }


    public static boolean isPalindrome(String variable) {
        String variable1 = "";

        for (int i = variable.length() - 1; i >= 0; i--) {
            variable1 += variable.charAt(i);
        }
        if (variable1.toString().equals(variable)) {
            return true;
        } else {
            return false;
        }
    }
}
