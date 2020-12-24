package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
        /* or
        double minus1=x2-x1;
        double minus2=y2-y1;
        double first=Math.pow(minus1,2);
        double second=Math.pow(minus2,2);
        double summa=first+second;
        double rsl=Math.sqrt(summa);
        return rsl;*/
    }

    public static void main(String[] args) {
        double result1 = Point.distance(1, 3, 5, 6);
        double result2 = Point.distance(7, 4, 4, 9);
        double result3 = Point.distance(10, 16, 25, 8);
        System.out.println("result (, 3) to (5, 6) " + result1);
        System.out.println("result (7, 4) to (4, 9) " + result2);
        System.out.println("result (10, 16) to (25, 8) " + result3);
    }
}
