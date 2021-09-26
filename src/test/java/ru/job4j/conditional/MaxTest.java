package ru.job4j.conditional;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenmaxequal() {
        int first = 110;
        int second = 110;
        int result = Max.max(first, second);
        int expected = 110;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenmaxsixth() {
        int first = 87;
        int second = 21;
        int third = 34;
        int forth = 29;
        int fifth = 14;
        int sixth = 89;
        int result = Max.max(first, second, third, forth, fifth, sixth);
        int expected = 89;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenmaxthird() {
        int first = -1;
        int second = -11;
        int third = 250;
        int forth = 108;
        int result = Max.max(first, second, third, forth);
        int expected = 250;
        Assert.assertEquals(result, expected);
    }
}
