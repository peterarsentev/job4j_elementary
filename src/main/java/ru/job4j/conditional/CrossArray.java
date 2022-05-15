package ru.job4j.conditional;

import java.util.Arrays;

public class CrossArray {
    public static int[] printCrossEl(int[] left, int[] right) {
        int count = 0;
        int[] rsl = new int[100];
        for (int l = 0; l < rsl.length; l++) {
            for (int i : left) {
                for (int j : right) {
                    if (i == j) {
                        rsl[l] = i;
                        break;
                    }
                    count++;
                }
            }
        }
        return Arrays.copyOf(rsl, count);
        }

    public static void main(String[] args) {
        int[] left = {21, 38, 8, 27, 14, 33};
        int[] right = {2, 11, 38, 21, 7, 33, 33, 14, 21};
        int[] array = printCrossEl(left, right);
        String dataString = Arrays.toString(array);
        System.out.println(dataString);
        }
    }
