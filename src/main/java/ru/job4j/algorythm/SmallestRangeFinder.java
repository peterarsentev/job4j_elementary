package ru.job4j.algorythm;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {
        int end;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                end = i + 1;
                count++;
            } else {
                return null;
            }
            if (count == k) {
                return new int[] {end - k + 1, end};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3, 4, 7, 8};
        int k1 = 4;
        int[] result1 = findSmallestRange(nums1, k1);
        if (result1 != null) {
            System.out.println("Наименьший диапазон с " + k1 + " различными элементами: " + Arrays.toString(result1));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}
