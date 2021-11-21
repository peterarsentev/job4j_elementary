package ru.job4j.condition;

public class SqArea {

//    public static double square(double p, double k) {
//        double h = p / (2 * (k + 1));
//        return Math.pow(h, 2) * k;
//    }

//    public static void main(String[] args) {
//        double result1 = SqArea.square(4, 1);
//        double result2 = SqArea.square(6, 2);
//        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
//        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
//        result1 = SqArea.square(10, 3);
//        System.out.println(result1);
//    }

    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
}
