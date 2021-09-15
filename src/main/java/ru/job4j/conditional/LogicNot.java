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
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean x = LogicNot.isEven(21);
        System.out.println("Число 21 чётное - " + x);
        x = LogicNot.isPositive(21);
        System.out.println("положительное - " + x);
        x = LogicNot.notEven(21);
        System.out.println("нечётное - " + x);
        x = LogicNot.notPositive(21);
        System.out.println("отрицательное - " + x);
        x = LogicNot.notEvenAndPositive(21);
        System.out.println("нечётное и положительное - " + x);
        x = LogicNot.evenOrNotPositive(21);
        System.out.println("чётное или отрицательное - " + x);
    }
}
