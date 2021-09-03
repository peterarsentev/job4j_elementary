package ru.job4j;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            char val = board[row][cell];
            if (val != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board[column].length; row++) {
            char val = board[row][column];
            if (val != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                char val = board[row][cell];
                if (row == cell) {
                    rsl[cell] = val;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'L', 'V', 'I'},
                {'a', 'E', 'O'},
                {'b', 'K', 'X'}
        };
        String arrayString = Arrays.toString(MatrixCheck.extractDiagonal(board));
        System.out.println(arrayString);
    }
}
