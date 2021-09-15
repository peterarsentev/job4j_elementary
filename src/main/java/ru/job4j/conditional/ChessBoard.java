package ru.job4j.conditional;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (0 <= x1 && x1 < 8 && 0 <= y1 && y1 < 8 && 0 <= x2 && x2 < 8 && 0 <= y2 && y2 < 8) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(5, 2, 1, 6));
        System.out.println(ChessBoard.way(-5, 0, 2, 7));
        System.out.println(ChessBoard.way(0, 7, 3, 4));
        System.out.println(ChessBoard.way(2, 5, 4, 7));
    }
}
