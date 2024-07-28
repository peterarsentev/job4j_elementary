package ru.job4j.add;

import java.util.*;

public class GetMaxCount {
    public static char getMaxCount(String str) {
        if (str == null || str.isEmpty()) {
            return '\u0000';
        }

        char result = '\u0000';
        int maxValue = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        String string = str.replaceAll("\\s+", "").toLowerCase(); /* Удаление всех пробелов
        и приведение к нижнему регистру */

        for (char symbol : string.toCharArray()) {
            if (Character.isLetter(symbol)) { /* Учитываем только буквы */
                int count = map.getOrDefault(symbol, 0) + 1;
                map.put(symbol, count);
                if (count > maxValue) {
                    maxValue = count;
                    result = symbol;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String testString = "This is a test string";
        char maxChar = getMaxCount(testString);
        System.out.println("The most frequent character is: " + maxChar);
    }
}
