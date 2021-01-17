package ru.job4j.temp;

public class ExampleTemp001 {

    public static int tempExample(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        }
        if (b > a) {
            if (b > c) {
                return b;
            }
        }
        if (c > a) {
            if (c > b) {
                return c;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 15, b = 12, c = 20;
        int result = ExampleTemp001.tempExample(a, b, c);
        System.out.println(result);
        System.out.println();

        boolean rslForCheck = LogicOr.check(9);
        System.out.println(rslForCheck);

        int rsl = Game.checkGame(0.2, 50, 9);
        System.out.println(rsl);
    }

    public static class EvenCheck {
        public static boolean check(int num) {
            boolean rsl = false;
            if (num % 2 == 0) {
                rsl = true;
            }
            return rsl;
        }
    }

    public static class LogicOr {
        public static boolean check(int num) {
            return num < 0 || num % 2 != 0;
        }
    }

    public static class Game {
        public static int checkGame(double percent, int prize, int pay) {
            return percent * prize > pay ? prize - pay : 0;
        }
    }
}