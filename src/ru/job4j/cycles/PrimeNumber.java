package ru.job4j.cycles;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    if (CheckPrimeNumber.check(number)) {
                        return number;
                    }
                }
            }
        }
        return count;
}

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
