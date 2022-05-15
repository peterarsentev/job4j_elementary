package ru.job4j.cycles;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.cycles.PrimeNumber;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when87() {
        int finish = 87;
        int result = PrimeNumber.calc(finish);
        int expected = 23;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when7() {
        int finish = 7;
        int result = PrimeNumber.calc(finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3() {
        int finish = 3;
        int result = PrimeNumber.calc(finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}
