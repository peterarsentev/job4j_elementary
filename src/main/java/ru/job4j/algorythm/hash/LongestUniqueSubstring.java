package ru.job4j.algorythm.hash;

import java.util.HashMap;

public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String string) {
        var result = "";
        var remain = string.length();
        while (remain > 0) {
            for (int i = 0; i <= string.length() - remain; i++) {
                var substring = string.substring(i, i + remain);
                if (isUniqueString(substring)) {
                    result = substring;
                    break;
                }
            }
            if (!result.isEmpty()) {
                break;
            }
            remain--;
        }
        return result;
    }

    private static boolean isUniqueString(String string) {
        var histogram = new HashMap<Integer, Integer>();
        string.codePoints().forEach(value -> {
            histogram.computeIfPresent(value, (k, v) -> v + 1);
            histogram.putIfAbsent(value, 1);
        });
        return histogram.entrySet().stream().filter(entry -> entry.getValue() > 1).findAny().isEmpty();
    }
}
