package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(77);
        float dollar = Converter.rubleToDollar(63);
        System.out.println("77 rubles are " + euro + " euro.");
        System.out.println("63 rubles are " + dollar + " dollars.");
    }
}
