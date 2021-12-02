package ru.job4j.tasks;

/**
 * 1.1.4. Оператор ветвления - упражения
 */
public class Condition {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        double sum = percent * prize;
        double res = sum - pay;
        if (sum > pay && res > 0) {
            rsl = (int) res;
        }
        return rsl;
    }

    public static int countCup(int count, int n) {
        int rsl = count;
        if (count >= n) {
            rsl = count / n + count;
        }
        return rsl;
    }

    public static String selectAction(int left, int right, int rsl) {
        String res = "none";
        if (rsl == left + right) {
            res = "added";
        } else if (rsl == left - right) {
            res = "subtracted";
        } else if (rsl == left * right) {
            res = "multiplied";
        } else if (rsl == left / right) {
            res = "divided";
        }
        return res;
    }

    public static String checkNumberHelloWorld(int number) {
        String rsl = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            rsl = "Hello, World!!!";
        } else if (number % 5 == 0) {
            rsl = "World";
        } else if (number % 3 == 0) {
            rsl = "Hello";
        }
        return rsl;
    }

    public static boolean checkYear(int year) {
        boolean rsl = false;
        if (year % 400 == 0) {
            rsl = true;
        } else if (year % 100 == 0) {
            rsl = false;
        } else if (year % 4 == 0) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean checkAttackRook(String left, String right) {
        boolean result = false;
        char firstSymbolLeft = left.charAt(0);
        char secondSymbolLeft = left.charAt(1);
        char firstSymbolRight = right.charAt(0);
        char secondSymbolRight = right.charAt(1);
        if (firstSymbolLeft == firstSymbolRight || secondSymbolLeft == secondSymbolRight) {
            result = true;
        }
        return result;
    }

    public static boolean checkPairsCharString(String l, String r) {
        boolean result = false;
        if (l.equals("") && r.equals("")) {
            result = true;
        } else if (l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
        System.out.println(selectAction(6, 2, 3));
        System.out.println(checkNumberHelloWorld(5));
        System.out.println(checkYear(1800));
    }
}
