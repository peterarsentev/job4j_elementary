package ru.job4j.cycles;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        long result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForElevenThen() {
        int n = 11;
        long result = Factorial.calc(n);
        int expected = 39916800;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        long result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
