package com.metanit.zadaniya;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ryghhgyr";
        System.out.println(isPalindrome1(str));
        System.out.println(isPalindrome2(str));
    }


    public static boolean isPalindrome1(String variable) {
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

    public static boolean isPalindrome2(String variable) {
        StringBuilder stringBuilder = new StringBuilder(variable);
        return stringBuilder.reverse().toString().equals(variable);
    }
}

