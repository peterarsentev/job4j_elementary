package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result1 = ru.job4j.condition.SqArea.square(6, 2);
        double result2 = ru.job4j.condition.SqArea.square(12, 4);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 12, k = 4, s = 4, real = " + result2);
    }
}
