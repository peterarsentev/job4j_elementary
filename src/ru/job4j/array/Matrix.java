package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (j + 1) * (i + 1);
                System.out.printf("%2d ", table[i][j]);
            }
            System.out.println();
        }
        return table;
    }
}