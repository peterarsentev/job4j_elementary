package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        double expected1 = 2.3333333;
        float out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2,3333333 dollar. Test result : " + passed1);
    }
}
