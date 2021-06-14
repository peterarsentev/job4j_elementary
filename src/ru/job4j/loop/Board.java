package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}
