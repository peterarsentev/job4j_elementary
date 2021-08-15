package ru.job4j.conditional;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(8);
        possibleDiv(45);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers.");
        }
    }
}
