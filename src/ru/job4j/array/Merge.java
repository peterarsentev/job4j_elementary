package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iLeft = 0, iRight = 0, iRsl = 0;
        while (iLeft < left.length && iRight < right.length) {
            rsl[iRsl++] = left[iLeft] < right[iRight] ? left[iLeft++] : right[iRight++];
        }
        while (iLeft < left.length) {
            rsl[iRsl++] = left[iLeft++];
        }
        while (iRight < right.length) {
            rsl[iRsl++] = right[iRight++];
        }
        return rsl;
    }
}