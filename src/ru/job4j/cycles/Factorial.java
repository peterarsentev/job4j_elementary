package ru.job4j.cycles;

public class Factorial {
    public static long calc(int n) {
        long rsl = 1;
        for (int i = 2; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}

