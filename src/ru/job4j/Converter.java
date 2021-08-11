package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = 70 * value;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = 60 * value;
        return rsl;
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
