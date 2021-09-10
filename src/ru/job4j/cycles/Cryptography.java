package ru.job4j.cycles;

public class Cryptography {
    public static String code(String s) {
        StringBuilder st = new StringBuilder(s);
        if (st == null) {
            return "empty";
        } if else ((st.length > 0) && (st.length < 5)) {
            return st;
        } else {
            for (int i = 0; i <= st.length - 4; i++) {
                st.setCharAt(i, '#');
            }
            return st;
        }
    }
}

