package ru.job4j.conditional;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                rsl = "Исходное число делится на 6";
            } else {
                rsl = "Исходное число не делится на 3, но является чётным";
            }
        } else {
            if (number % 3 == 0) {
                rsl = "Исходное число делится на 3, но не является чётным";
            } else {
                rsl = "Исходное число не делится на 3 и не является чётным";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("87 - " + checkNumber(87));
        System.out.println("11 - " + checkNumber(11));
        System.out.println("420 - " + checkNumber(420));
        System.out.println("1008 - " + checkNumber(1008));
    }
}

