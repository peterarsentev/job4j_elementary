package ru.job4j.loop;

/**
 * 5.0. Цикл for. Определение. [#3572]
 */
public class LoopFor {
    public static void main(String[] args) {
        int i;
        boolean result;
        for (i = 5; result = i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнения цикла равно: " + result);
    }
}
