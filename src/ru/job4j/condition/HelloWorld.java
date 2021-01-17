package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String answer = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            answer = "Hello, World!!!";
        } else if (number % 5 == 0) {
            answer = "World";
        } else if (number % 3 == 0) {
            answer = "Hello";
        }
        return answer;
    }
}