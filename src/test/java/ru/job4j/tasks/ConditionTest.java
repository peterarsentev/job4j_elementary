package ru.job4j.tasks;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * 1.1.4. Оператор ветвления - упражения тесты
 */

public class ConditionTest {

    @Test
    public void checkGame() {
        int rsl = Condition.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = Condition.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }

    @Test
    public void countCup() {
        int rsl = Condition.countCup(7, 6);
        assertThat(rsl, is(8));
    }

    @Test
    public void countCup1() {
        int rsl = Condition.countCup(213, 6);
        assertThat(rsl, is(248));
    }

    @Test
    public void checkYearFalse() {
        boolean b = Condition.checkYear(2019);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearFalse1() {
        boolean b = Condition.checkYear(1800);
        assertThat(b, is(false));
    }

    @Test
    public void checkYearTrue() {
        boolean b = Condition.checkYear(2020);
        assertThat(b, is(true));
    }

    @Test
    public void checkYearTrue1() {
        boolean b = Condition.checkYear(2000);
        assertThat(b, is(true));
    }

    @Test
    public void checkTrue() {
        boolean check = Condition.checkAttackRook("A8", "E8");
        assertThat(check, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean check = Condition.checkAttackRook("H4", "H3");
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Condition.checkAttackRook("A1", "B2");
        assertThat(check, is(false));
    }

    @Test
    public void checkFalse1() {
        boolean check = Condition.checkAttackRook("F5", "C8");
        assertThat(check, is(false));
    }

    /*
     *1.8. Необычные пары
     */
    @Test
    public void checkPairsCharString() {
        boolean rsl = Condition.checkPairsCharString("", "");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkPairsCharString1() {
        boolean rsl = Condition.checkPairsCharString("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkPairsCharStringFalse() {
        boolean rsl = Condition.checkPairsCharString("booking", "grabber");
        assertThat(rsl, is(false));
    }
}
