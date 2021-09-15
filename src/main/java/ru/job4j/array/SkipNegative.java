package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                    int val = array[row][cell];
                    if (val < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

        public static void main(String[] args) {
            int[][] array = {
                    {-89, 2, 3},
                    {3, 0, -1},
                    {-2, 3, 1}
            };
            SkipNegative.skip(array);
            String arrayString = Arrays.deepToString(array);
            System.out.println(arrayString);
        }
    }
