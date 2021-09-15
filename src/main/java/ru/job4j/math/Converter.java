package ru.job4j.math;

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
        float dollar = Converter.rubleToDollar(180);
        float rubleFromEuro = Converter.euroToRuble(200);
        float rubleFromDollar = Converter.dollarToRuble(300);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("200 euro are " + rubleFromEuro + " rubles.");
        System.out.println("300 dollars are " + rubleFromDollar + " rubles.");
        float expected = 2;
        float out = Converter.rubleToEuro(140);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(180);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);
        float expected3 = 14000;
        float out3 = Converter.euroToRuble(200);
        boolean passed3 = expected3 == out3;
        System.out.println("200 euro are 14000 rubles. Test result : " + passed3);
        float expected4 = 18000;
        float out4 = Converter.dollarToRuble(300);
        boolean passed4 = expected4 == out4;
        System.out.println("300 dollars are 18000 rubles. Test result : " + passed4);
    }
}
