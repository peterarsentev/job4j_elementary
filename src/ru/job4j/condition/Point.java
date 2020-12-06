package ru.job4j.condition;

import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double argFirst = Math.pow((x2 - x1), 2);
        double argSecond = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(argFirst + argSecond);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

