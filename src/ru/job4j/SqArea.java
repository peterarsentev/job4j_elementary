package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double one = k + 1;
        double two = one * 2;
        double h = p / two;
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(60, 5);
        double result3 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 60, k = 5, s = 125, real = " + result2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result3);
    }
}

