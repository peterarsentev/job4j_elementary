package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int maxValue = first > second ? first : second;
        int result = maxValue > third ? maxValue : third;
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(1, 4, 2);
        System.out.println(result);
    }
}
