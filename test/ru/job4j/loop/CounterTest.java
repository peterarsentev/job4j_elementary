package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToFortyOneThenThirty() {
        int rsl = Counter.sumByEven(20, 40);
        int expected = 330;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNineteenToFortyThenThreeHundredThirty() {
        int rsl = Counter.sumByEven(19, 41);
        int expected = 330;
        assertThat(rsl, is(expected));
    }
/*
    // с учетом отрицательных чисел,
    @Test
    public void whenSumEvenNumbersFromNegativeTenToPositiveTenThenSixty() {
        int rsl = Counter.sumByEven(-10, 10);
        int expected = 60;
        assertThat(rsl, is(expected));
    }
*/
}