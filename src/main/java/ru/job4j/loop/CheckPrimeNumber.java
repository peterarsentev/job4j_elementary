package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 2; index <= number/2; index++) {
            if ((number % 5) == 0) {
                prime = true;
                break;
            }

        }
        return prime;
    }
}