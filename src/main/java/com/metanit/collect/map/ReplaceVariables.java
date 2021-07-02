package com.metanit.collect.map;

import java.util.Map;

public class ReplaceVariables {
    public static void main(String[] args) {
        String res = replaceVariables("Мама купила $cakeCnt тортов за $money рублей", Map.of("cakeCnt", 12.2, "money", 14.4));

        System.out.println(res);
    }

    public static String replaceVariables(String expression, Map<String, Double> variableValues) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < expression.length()) {
            if (expression.charAt(i) == '$') {
                int _$ = i;
                while (expression.charAt(i) != ' ') {
                    i++;
                }

                String varName = expression.substring(_$ + 1, i);
                Double varValue = variableValues.get(varName);

                sb.append(varValue);
                sb.append(' ');
            } else {
                sb.append(expression.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }

}
