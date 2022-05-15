package ru.job4j.cycles;

public class Abbrev {
    public static String collect(String s) {
        String[] strings = s.split(" ");
        StringBuilder rsl = new StringBuilder();
        for (String st : strings) {
            rsl.append(st.charAt(0));
        }
        return rsl.toString();
    }
}
