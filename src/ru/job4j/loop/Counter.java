package ru.job4j.loop;

public class Counter {

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
            start++;
        }
        return sum;
    }
}
/* // с учетом отрицательных чисел, например от -10 до +10
   // в тесте тоже подправить
        int sum = 0;
        int startToPositive;
        for (int i = start; i <= finish; i++) {
            if (start % 2 == 0) {
                startToPositive = start;
                sum = sum + Math.abs(startToPositive);
            }
            start++;
        }
        return sum;
*/
