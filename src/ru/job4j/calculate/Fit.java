package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (double) height;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (double) height;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }
}
