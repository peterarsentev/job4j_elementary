package ru.job4j.cycles;

public class Symmetry {
    public static boolean check(int i) {
        boolean x = true;
        String str = String.valueOf(i);
        for (int n = 0; n < str.length() / 2; n++) {
            if (str.charAt(n) != str.charAt(str.length() - n - 1)) {
                x = false;
                break;
            }
        }
        return x;
    }
}
