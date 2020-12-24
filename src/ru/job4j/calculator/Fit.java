package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        int coef = 100;
        double rsl = (height - coef) * 1.15;
        return rsl;
        /*or
        double rsl = (height-100)*1.15;
        return rsl;
         */
    }

    public static double womanWeight(short height) {
        int coef = 110;
        double rsl = (height - coef) * 1.15;
        return rsl;
        /*or
        double rsl = (height-110)*1.15;
        return rsl;
         */
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 160;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 160 is " + woman);
    }
}
