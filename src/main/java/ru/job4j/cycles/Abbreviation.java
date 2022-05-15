package ru.job4j.cycles;

public class Abbreviation {
    public static int mod(int n, int d) {
        int rsl = 0;
        while (n >= d) {
           n = n - d;
           rsl++;
        }
            return rsl;
        }

    public static void main(String[] args) {
        System.out.println(mod(111, 11));
    }
}
