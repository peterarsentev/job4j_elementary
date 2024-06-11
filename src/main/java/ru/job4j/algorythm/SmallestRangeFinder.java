package ru.job4j.algorythm;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == k) {
                return new int[] {i + 2 - k, i + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 7, 9, 11};
        int k = 5;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }
}
