package ru.job4j.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Point {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = reader.read();
        int x2 = reader.read();
        int y1 = reader.read();
        int y2 = reader.read();
       distance(x1, y1 , x2, y2);

    }
    public static double distance(int x1, int y1, int x2, int y2){
        double result = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
        System.out.println("result " + " ( " + x2 + ", " + x1 + ")"  + " to " + " ( " + y2 + ", "+ y1 + ") " + result);
        return result;
    }
}
