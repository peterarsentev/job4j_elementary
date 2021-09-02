package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow5AndColumnNotEquals() {
        int[][] array = {
                {1, 8, 800, 120, 250},
                {-5, 2, 5},
                {1, -20, -1, -4},
                {18, 21, 26, 87},
                {10, 5, 5, 10}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 8, 800, 120, 250},
                {0, 2, 5},
                {1, 0, 0, 0},
                {18, 21, 26, 87},
                {10, 5, 5, 10}
        };
        Assert.assertArrayEquals(expected, result);
    }
}
