package ru.job4j.math;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manheight = 197;
        short womanheight = 162;
        double man = Fit.manWeight(manheight);
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Man 197 is " + man);
        System.out.println("Woman 162 is " + woman);
    }
}
