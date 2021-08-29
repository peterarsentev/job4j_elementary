package ru.job4j.cycles;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        if (percent >= 1) {
            percent = percent / 100;
        }
        while (amount + amount * percent >= salary) {
            amount = amount + amount * percent - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 120, 0.5));
        System.out.println(year(300, 120, 0.3));
        System.out.println(year(10000, 3000, 10));
    }
}
