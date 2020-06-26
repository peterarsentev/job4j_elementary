package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = ThreeMax.max(10, 5, 1);
        System.out.println(rsl);
    }
}
