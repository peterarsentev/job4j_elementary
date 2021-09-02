package ru.job4j;

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
}
