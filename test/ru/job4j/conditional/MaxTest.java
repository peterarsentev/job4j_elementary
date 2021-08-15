package ru.job4j.conditional;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenmaxright() {
        int left = 33;
        int right = 110;
        int result = Max.max(left, right);
        int expected = 110;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenequal() {
        int left = 21;
        int right = 21;
        int result = Max.max(left, right);
        int expected = 21;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenmaxleft() {
        int left = -1;
        int right = -11;
        int result = Max.max(left, right);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}
