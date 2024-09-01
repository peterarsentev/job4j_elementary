package ru.job4j.algorythm.sort;

import java.util.Arrays;

public class Merge {

    public static int[] mergeSort(int[] array) {
        int[] result = array;
        int n = array.length;
        if (n > 1) {
            int[] left = mergeSort(Arrays.copyOfRange(array, 0, n / 2));
            int[] right = mergeSort(Arrays.copyOfRange(array, n / 2, n));
            result = merge(left, right);
        }
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (leftCount < left.length && rightCount < right.length) {
                result[i] = left[leftCount] < right[rightCount] ? left[leftCount++] : right[rightCount++];
            } else if (leftCount < left.length) {
                result[i] = left[leftCount++];
            } else if (rightCount < right.length) {
                result[i] = right[rightCount++];
            }
        }
        return result;
    }
}
