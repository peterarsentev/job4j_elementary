package ru.job4j.conditional;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean x = Triangle.exist(20, 12, 31);
        System.out.println(x);
        x = Triangle.exist(18, 24, 48);
        System.out.println(x);
        x = Triangle.exist(95, 24, 48);
        System.out.println(x);
    }
}
