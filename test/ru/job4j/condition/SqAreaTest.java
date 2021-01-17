package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2forSquareThen2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP8K3forSquareThen3() {
        int p = 8;
        int k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP10K4forSquareThen4() {
        int p = 10;
        int k = 4;
        double expected = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP14K6forSquareThen6() {
        int p = 14;
        int k = 6;
        double expected = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }
}