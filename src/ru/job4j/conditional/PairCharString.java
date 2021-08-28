package ru.job4j.conditional;

public class PairCharString {
    public static boolean check(String l, String r) {
        boolean x = l.isEmpty() && r.isEmpty();
        if (l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0))  {
            x = true;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(check(" ", " "));
        System.out.println(check("Paris ", "Moscow"));
        System.out.println(check("subconciosness", "swiss"));
    }
}
