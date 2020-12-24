package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenp6k2then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = ru.job4j.condition.SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp12k4then4() {
        int expected = 4;
        int p = 12;
        int k = 4;
        double out = ru.job4j.condition.SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}