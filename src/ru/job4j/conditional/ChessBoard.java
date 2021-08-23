package ru.job4j.conditional;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (0 <= x1 && x1 < 8 && 0 <= y1 && y1 < 8 && 0 <= x2 && x2 < 8 && 0 <= y2 && y2 < 8) {
            if (x1 == y1 && x2 == y2) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int j = ChessBoard.way(5, 5, 1, 1);
        System.out.println(j);
        int j1 = ChessBoard.way(-5, -5, 10, 10);
        System.out.println(j1);
        int j2 = ChessBoard.way(7, 7, 8, 8);
        System.out.println(j2);
        int j3 = ChessBoard.way(0, 0, 5, 5);
        System.out.println(j3);
    }
}
