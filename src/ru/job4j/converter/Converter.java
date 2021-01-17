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
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        int inEuro = 140;
        int inDollar = 140;
        int expectedEuro = 2;
        int expectedDollar = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}