package ru.job4j.condition;

public class Point {
    public static int minus(int a, int b) {
        int rsl = a - b;
        return rsl;
    }

    public static double plus(double a, double b) {
        double rsl = a + b;
        return rsl;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        int rslMinus1 = Point.minus(x2, x1);
        int rslMinus2 = Point.minus(y2, y1);
        double rslPow1 = Math.pow(rslMinus1, 2);
        double rslPow2 = Math.pow(rslMinus2, 2);
        double rslPlus = Point.plus(rslPow1, rslPow2);
        double rsl = Math.sqrt(rslPlus);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 1, 7, 5);
        System.out.println("result (4, 1) to (7, 5) " + result);
    }
}
