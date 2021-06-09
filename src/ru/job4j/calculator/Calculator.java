package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double deductionAnddivision(double first, double second) {
        return deduction(first, second) + division(first, second);
    }

    public static double allSum(double firs, double second) {
        return sumAndMultiply(firs, second) + deductionAnddivision(firs, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 5));
        System.out.println("Результат расчета равен: " + deductionAnddivision(10, 5));
        System.out.println("Результат расчета равен: " + allSum(10, 5));
    }
}

