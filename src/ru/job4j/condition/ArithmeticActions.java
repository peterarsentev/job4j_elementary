package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String answer = "none";
        if (left * right == rsl) {
            answer = "multiplied";
        } else if (left / right == rsl || right / left == rsl) {
            answer = "divided";
        } else if (left - right == rsl || right - left == rsl) {
            answer =  "subtracted";
        } else if (left + right == rsl) {
            answer = "added";
        }
        return answer;
    }
}