package ru.job4j.temp;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int ii = 0; ii < right.length; ii++) {
                if (left[i] == right[ii]) {
                    System.out.println(left[i]);
                }
            }
        }
    }
}