package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas250Then8() {
        int[] data = {5, 4, 3, 2, 101, 111, 420, 105, 250};
        int el = 250;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexOf1(data, el, start, finish);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas99Then() {
        int[] data = {5, 4, 3, 2, 102, 825, 420, 300, 250};
        int el = 99;
        int start = 2;
        int finish = 8;
        int result = FindLoop.indexOf1(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then0() {
        int[] data = {10, 14, 18, 22, 26, 30};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas6Then2() {
        int[] data = {9, 1, 6, 3};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas20ThenMinus1() {
        int[] data = {9, 10, 18, 21, 30};
        int el = 20;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
