package ru.job4j.conditional;

public class AnGame {
    public static double checkGame(double percent, int prize, int pay) {
        double rsl = 0;
        if (percent >= 1) {
            percent = percent / 100;
        }
        if (percent * prize > pay) {
            rsl = percent * prize - pay;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.8, 200, 150));
        System.out.println(checkGame(80, 200, 150));
        System.out.println(checkGame(25, 200, 25));
    }
}

