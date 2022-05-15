package ru.job4j.cycles;

public class Cryptography {
    public static String code(String s) {
        StringBuilder st = new StringBuilder(s);
        if (st.isEmpty()) {
            return "empty";
        } else if ((st.length() > 0) && (st.length() < 5)) {
            return s;
        } else {
            for (int i = 0; i < st.length() - 4; i++) {
                st.setCharAt(i, '#');
            }
            return s;
        }
    }

    public static void main(String[] args) {
        String s = "2145876545315";
    }
}
