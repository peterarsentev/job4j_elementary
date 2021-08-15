package ru.job4j.conditional;

public class Max {
    public static int max(int left, int right) {
        boolean x = left > right;
        return x ? left : right;
    }

    public static void main(String[] args) {
        int a = Max.max(33, 110);
        System.out.println(a);
        int b = Max.max(21, 21);
        System.out.println(b);
        int c = Max.max(-1, -11);
        System.out.println(c);
    }
}
