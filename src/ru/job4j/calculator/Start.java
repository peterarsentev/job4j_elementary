package ru.job4j.calculator;

public class Start {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.one = 1;
        calc.two = 2;
        calc.four = 4;
        calc.five = 5;
        calc.six = 6;

        System.out.println(calc.fourTimeTwo(calc.two, calc.four));
        System.out.println(calc.fiveMinusTwo(calc.two, calc.five));
        System.out.println(calc.sixDivTwo(calc.two, calc.six));

    }
}
