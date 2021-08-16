package ru.job4j.conditional;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean x = LogicNot.isEven(21);
        System.out.println(x);
        x = LogicNot.isPositive(21);
        System.out.println(x);
        x = LogicNot.notEven(21);
        System.out.println(x);
        x = LogicNot.notPositive(21);
        System.out.println(x);
        x = LogicNot.notEvenAndPositive(21);
        System.out.println(x);
        x = LogicNot.evenOrNotPositive(21);
        System.out.println(x);
    }
}
