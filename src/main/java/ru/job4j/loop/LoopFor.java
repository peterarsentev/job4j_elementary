package ru.job4j.loop;

/**
 * 5.0. Цикл for. Определение. [#3572]
 */
public class LoopFor {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        int i;
        for (i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
    }
}
