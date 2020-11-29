package ru.job4j.calculator;


public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void hello(int age, String name){
        System.out.println("Hello " + name + " age = " + age);
    }

    public static void main(String[] args) {
        String name = "Aleksandr";
        int age = 33;

        ArgMethod.hello(name);
        ArgMethod.hello(age, name);

    }
}