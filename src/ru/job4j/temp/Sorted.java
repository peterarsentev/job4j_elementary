package ru.job4j.temp;

public class Sorted {

    public static boolean isSorted(int[] array) {
        boolean checking = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                checking = true;
            } else {
                checking = false;
            }
        }
        return checking;
    }
}