package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < 4; i++) {
            for (int index = 0; index < size; index++) {
                while ((money - price) - coins[i] > 0) {
                    size++;
                }
                rsl[index] = coins[i] * size;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
