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
        String string = str.replaceAll(" ", "").toLowerCase();
        for (char symbol : string.toCharArray()) {
            int count = map.getOrDefault(symbol, 0) + 1;
            map.put(symbol, count);
            if (count > maxValue) {
                maxValue = count;
                result = symbol;
            }
        }
        return result;
    }
}
