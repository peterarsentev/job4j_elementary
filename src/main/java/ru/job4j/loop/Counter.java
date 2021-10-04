package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println("Результат вычисления остатка от деления:" + 21 % 16);
        System.out.println("Результат вычисления остатка от деления:" + 9 % 12);
        System.out.println("Результат вычисления остатка от деления:" + 7 % 3);
        System.out.println("Результат вычисления остатка от деления:" + 15 % 5);
        System.out.println("Результат вычисления остатка от деления:" + 17 % 3);
    }
}

