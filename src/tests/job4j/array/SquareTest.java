package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound3Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound3Then100() {
        int bound = 11;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        Assert.assertArrayEquals(expected, result);
    }
}
