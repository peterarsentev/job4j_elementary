package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollar.");

        in = 100;
        expected = 1;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("100 rubles are 1. Test result : " + passed);
    }
}
