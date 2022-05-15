package ru.job4j.cycles;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.cycles.Counter;

public class CounterTest {

    @Test
        public void whenSumEvenNumbersFromToThen() {
            int start = 30;
            int finish = 42;
            int result = Counter.sumByEven(start, finish);
            int expected = 252;
            Assert.assertEquals(expected, result);
        }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyThenNinety() {
        int start = 10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromToThenSum() {
        int start = 114;
        int finish = 299;
        int result = Counter.sumByEven(start, finish);
        int expected = 19158;
        Assert.assertEquals(expected, result);
    }
}
