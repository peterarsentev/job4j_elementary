package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean answer = false;
        if (year % 400 == 0) {
            answer = true;
        } else if (year % 100 == 0 || year % 4 != 0) {
            answer = false;
        } else if (year % 4 == 0) {
            answer = true;
        }
        return answer;
    }
}