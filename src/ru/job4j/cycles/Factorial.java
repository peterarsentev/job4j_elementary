package ru.job4j.cycles;

public class Factorial {
    public static long calc(int n) {
        long rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        if (n == 0) {
            return rsl;
        }
        return rsl;
    }
}

