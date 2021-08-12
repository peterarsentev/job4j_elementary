package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return 70 * value;
    }

    public static float dollarToRuble(float value) {
        return 60 * value;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float rubleFromEuro = Converter.euroToRuble(110);
        float rubleFromDollar = Converter.dollarToRuble(110);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("110 euro are " + rubleFromEuro + " rubles.");
        System.out.println("110 dollars are " + rubleFromDollar + " rubles.");
    }
}
