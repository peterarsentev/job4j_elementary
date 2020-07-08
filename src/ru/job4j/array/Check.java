package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
               for (int i = 0; i < data.length; i++) {
                   if (data[i] == result) {
                       result = true;
                   } else {
                       result = false;
                   }
               }
        return result;

    }

    public static void main(String[] args) {
        boolean[] value = new boolean[]{true, true, true};
        Check.mono(value);

    }
}
