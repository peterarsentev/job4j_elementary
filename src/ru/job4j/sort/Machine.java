package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size, j = 0;
        money = money - price;
        for (size = 0; money > 0; size++) {
            while (money >= coins[size]) {
                money = money - coins[size];
                rsl[j++] = coins[size];
            }
        }
        size = j;
        return Arrays.copyOf(rsl, size);
    }
}