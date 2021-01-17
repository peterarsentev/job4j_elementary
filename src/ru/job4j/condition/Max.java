package ru.job4j.condition;

import java.lang.Math;

public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        third = Math.max(third, fourth);
        second = Math.max(second, third);
        return Math.max(first, second);
    }
}