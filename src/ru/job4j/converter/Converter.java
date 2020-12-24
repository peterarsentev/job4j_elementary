package ru.job4j.converter;

public class Converter {
        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60;
            return rsl;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            int dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("180 rubles are " + dollar + " dollar.");

            int inOne = 140;
            int expectedOne = 2;
            int outOne = Converter.rubleToEuro(inOne);
            boolean passed = expectedOne == outOne;
            System.out.println("140 rubles are 2. Test result : " + passed);

            int inTwo = 180;
            int expectedTwo = 3;
            int outTwo = Converter.rubleToEuro(inTwo);
            boolean passedTwo = expectedTwo == outTwo;
            System.out.println("180 rubles are 3. Test result : " + passed);
        }
    }

