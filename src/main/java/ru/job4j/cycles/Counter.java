package ru.job4j.cycles;

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
        for (int i = start; i <= finish; i++)  {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(30, 38));
        System.out.println(sum(-108, -100));
        System.out.println(sumByEven(0, 5));
        System.out.println(sumByEven(30, 42));
        System.out.println(sumByEven(-108, -100));
        System.out.println(sumByEven(114, 299));
    }
}
