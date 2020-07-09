package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
             for (int i = 0; i < array.length; i++) {
                 if (i > start && i <= finish) {
                     if (array[i] < min) {
                         min = array[i];
                     }
                 }
              }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 5, 10};
        MinDiapason.findMin(array, 1, 3);
    }
}
