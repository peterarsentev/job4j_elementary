package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double n = (p - a) * (p - b) * (p - c) * p;
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(8, 3, 7);
        double rsl3 = TrgArea.area(42, 50, 84);
        System.out.println("area (2, 2, 2) = " + rsl1);
        System.out.println("area (8, 3, 7) = " + rsl2);
        System.out.println("area (42, 50, 84) = " + rsl3);
    }
}
