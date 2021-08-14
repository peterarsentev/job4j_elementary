package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double first = Math.pow(one, 2);
        double second = Math.pow(two, 2);
        double third = first + second;
        return Math.sqrt(third);
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(11, 14, 21, 14);
        double result3 = Point.distance(0, 8, 0, 28);
        double result4 = Point.distance(8, 3, 10, 21);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (11, 14) to (21, 14) " + result2);
        System.out.println("result (0, 8) to (0, 28) " + result3);
        System.out.println("result (8, 3) to (10, 21) " + result4);
    }
}
