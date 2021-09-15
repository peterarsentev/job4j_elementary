package ru.job4j.array;

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
                rsl[row] = board[row][row];
            }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
                if (board[index][index] == 'X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
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
