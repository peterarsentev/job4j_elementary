package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                    matrix = new int[row][cell];
                    matrix[row][cell] = (row + 1) * (cell + 1);
                }
            }
        return matrix;
    }

    public static void main(String[] args) {
        Matrix.multiple(5);
        System.out.println(Matrix.multiple(5));
    }
}

