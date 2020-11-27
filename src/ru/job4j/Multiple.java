package ru.job4j;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {
    proiz();
    }
    public static void proiz( ){
        int b = 1;
        int a = 1;
        for (;b <= 9; b++ ){
            int c = a * b;
            System.out.println(a + " * " + b + " = " + c );
        }
    }
}
