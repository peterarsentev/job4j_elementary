package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, String lastName) {
        System.out.println("Hello, " + name + lastName);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age);
    }

    public static void hello(int age) {
        System.out.println("Hello, " + age);
    }

    public static void hello(String name, String lastName, String thirdName) {
        System.out.println("Hello, " + name + lastName + thirdName);
    }

    public static void main(String[] args) {
        String name = "Petr ";
        String lastName = "Arsentev ";
        String thirdName = "Next";
        int age = 33;
        ArgMethod.hello(name, lastName);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(name, lastName, thirdName);
    }
}