package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean f = number > 2;

        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                f = false;
                break;
            }
        }
        return  f;

    }

    public static void main(String[] args) {
        CheckPrimeNumber.check(5);
    }
}
