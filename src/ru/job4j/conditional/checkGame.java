package ru.job4j.conditional;

public class checkGame {
    public static int game(double percent, int prize, int pay) {
        int rsl = 0;
        if (percent * prize > pay) {
            rsl = percent * prize- pay;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(game(0.8, 120, 94));
        System.out.println(game(0.9, 33, 30));
    }
}
