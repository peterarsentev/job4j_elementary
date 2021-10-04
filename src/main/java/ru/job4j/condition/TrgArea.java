package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = (p - a) * (p - b) * (p - c);
        double second = p * first;
        double rsl = Math.sqrt(second);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2.5, 2.5, 3);
        System.out.println("area (2.5, 2.5, 3) = " + rsl);
    }
}

