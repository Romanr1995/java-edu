package com.metanit.collect.map;

import java.util.*;

public class DemoCode1 {
    public static void main(String[] args) {
//        printBirthdays(Arrays.asList(12, 14, 13, 10, 15, 10, 12, 13, 12, 11, 14, 32));

        Set<String> str = new HashSet<>();

        str.add("frgr");
        str.add("w");
        str.add("uy");
        str.add("r");
        str.add("hfd");
        str.add("dkl");
        str.add("");

        printWordStatistics(str);
    }

    /**
     * HW0
     * выводит в консоль список слов по группам: группа определятся длинной слова
     * пример:
     * [abc, foo, test, aaaa, bar, 99] ->
     * Группа 2 : 99
     * Группа 3 : abc, foo, bar
     * Группа 4 : test, aaaa
     */
    public static void printWordStatistics(Set<String> words) {
        Map<Integer, String> groupsOfStrings = new HashMap<>();

        for (String s : words) {
            if (groupsOfStrings.get(s.length()) == null) {
                groupsOfStrings.put(s.length(), "" + s);
            } else {
                groupsOfStrings.put(s.length(), groupsOfStrings.get(s.length()) + ", " + s);
            }
        }

        for (Map.Entry<Integer, String> e : groupsOfStrings.entrySet()) {
            int group = e.getKey();
            String words1 = e.getValue();
            System.out.println("Группа: " + group + " : " + words1);
        }
    }

    /**
     * HW1
     * $x + $y
     * {
     * x = 10.1,
     * y = 12.0
     * }
     * => 10.1 + 12.0
     * <p>
     * expression = Мама купила $cakeCnt тортов за $money рублей.
     * variableValues  = { cakeCnt = 10 }
     * =>
     * Мама купила 10 тортов.
     *
     * @see String#indexOf(String) -возвращает индекс указанной начала подстроки или -1 (если не нашлось)
     * @see String#indexOf(String, int) - ищет подстроку не с начала с указаной позиции
     * @see String#substring(int, int) возвращает подстроку (от начало включительно до конца не включетельно)
     */
    public static String replaceVariables(String expression, Map<String, Double> variableValues) {
        return null;
    }

    /**
     * Age 11: 2 c.
     * Age 12: 5 c.
     * Age 14: 1 c.
     */
    public static void printBirthdays(List<Integer> ages) {
        Map<Integer, Integer> agesToCnt = new TreeMap<>();

//        for (int age : ages) {
//            if (agesToCnt.get(age) == null) {
//                agesToCnt.put(age, 1);
//            } else {
//                agesToCnt.put(age, agesToCnt.get(age) + 1);
//            }
//        }

        for (Integer age : ages) {
            agesToCnt.put(age, agesToCnt.getOrDefault(age, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : agesToCnt.entrySet()) {
            int age = e.getKey();
            int cnt = e.getValue();

            System.out.println("age: " + age + " cnt = " + cnt);
        }

    }
}
