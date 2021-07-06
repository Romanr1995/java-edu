package com.metanit.zadaniya;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Brace {
    public static void main(String[] args) {
        System.out.println(isCorrectBraceSequene("()()"));
    }

    public static boolean isCorrectBraceSequene(String brace) {
        String braceHalf1 = "";
        String braceHalf2 = "";

        if (brace.length() %2 == 0) {
            for (int i = 0; i < brace.length() / 2; i++) {
                braceHalf1+=brace.charAt(i);
            }
            braceHalf1.toString();
            for (int k = brace.length() - 1; k >= brace.length() / 2; k--) {
               if (brace.charAt(k) == '}') {
                   braceHalf2+='{';
               } else if (brace.charAt(k) == ']') {
                   braceHalf2+='[';
               } else if (brace.charAt(k) == ')') {
                   braceHalf2+='(';
               }
            }
            braceHalf2.toString();


        } else {
            return false;
        }
        return braceHalf1.equals(braceHalf2);
    }

    public static boolean isBraceSequenceCorrect(String braces) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !isComplementTo(stack.pop(), c)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isComplementTo(char openingBrace, char closingBrace) {
        if (openingBrace == '(' && closingBrace != ')') return false;

        if (openingBrace == '[' && closingBrace != ']') return false;

        if (openingBrace == '{' && closingBrace != '}') return false;

        return true;
    }
}
