package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp; //4.3.2.1.5
        temp = array[0];
        array[0] = array[3];
        array[3] = temp; //1.3.2.4.5
        temp = array[1];
        array[1] = array[2];
        array[2] = temp; //1.2.3.4.5
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}