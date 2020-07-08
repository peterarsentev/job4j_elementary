package ru.job4j.array;


    public class Turn {
        public static int[] back(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }
            return array;

        }

        public static void main(String[] args) {
            int[] nums = new int[]{1, 2, 3, 4, 5, 6};
            int[] rsl = Turn.back(nums);
            for (int index = 0; index < rsl.length; index++) {
                System.out.println(rsl[index]);
            }
        }
    }

