package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {

        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < data.length; i++) {
            if (i > start && i < finish) {
                if (data[i] == el) {
                    rst = i;
                }
            }
         }
        return rst;
    }
        public static void main (String[]args) {
            int[] data = {5, 7, 0, 4};
            System.out.println(FindLoop.indexOf(data, 0, 1, 3));
        }
    }

