package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double ostatok;
        double credit = amount * 1.0;

        while (amount > 0) {
            ostatok = (credit * percent) - salary;

           if (ostatok > 0) {
               year++;

               credit = ostatok;
           }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(1000, 1200, 1));
    }
}

