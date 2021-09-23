package ru.job4j.conditional;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(max(first, second), max(third, forth));
    }

    public static int max(int first, int second, int third, int forth, int fifth) {
        return max(fifth, max(first, second), max(third, forth));
    }

    public static int max(int first, int second, int third, int forth, int fifth, int sixth) {
        return max(max(first, second), max(third, forth), max(fifth, sixth));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(33, 110));
        System.out.println(Max.max(33, 87, 49));
        System.out.println(Max.max(21, 18, 150, 150));
        System.out.println(Max.max(-10133, -111, -221, -100));
        System.out.println(Max.max(21, 18, 33, 11, 24));
        System.out.println(Max.max(90, 80, 70, 60, 50, 20));
    }
}
