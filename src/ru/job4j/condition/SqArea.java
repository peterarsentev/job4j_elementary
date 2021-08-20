package ru.job4j.condition;

public class SqArea {
    public static double plus(double a, double b) {
        double rsl = a + b;
        return rsl;
    }

    public static double div(double a, double b) {
        double rsl = a / b;
        return rsl;
    }

    public static double mult(double a, double b) {
        double rsl = a * b;
        return rsl;
    }

    public static double square(double p, double k) {
        double h = SqArea.div(p, SqArea.mult(2, SqArea.plus(k, 1)));
        double L = SqArea.mult(h, k);
        double rsl = SqArea.mult(L, h);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
