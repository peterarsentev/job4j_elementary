package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                count++;
                symbol = input.charAt(i);
            } else {
                result = result + symbol + count;
                count = 1;
            }
        }
        return result;
    }
}
