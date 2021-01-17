package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 187;
        double expected = 100;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void whenWoman180Then88() {
        short in = 187;
        double expected = 88.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.05);
    }

}