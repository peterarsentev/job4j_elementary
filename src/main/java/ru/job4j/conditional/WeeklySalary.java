package ru.job4j.conditional;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                if (hours[i] < 9) {
                    salary += 10 * hours[i];
                } else {
                    salary += 10 * 8 + 15 * (hours[i] - 8);
                }
            } else {
                if (hours[i] < 9) {
                    salary += 2 * 10 * hours[i];
                } else  {
                    salary += 2 * (10 * 8 + 15 * (hours[i] - 8));
                }
            }
        }
        return salary;
    }
}
