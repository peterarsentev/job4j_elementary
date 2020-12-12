package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Then5() {
        int[] data = {7, 8, 6, 4, 1, 2, 7, 8, 21, 11, 3};
        int el = 2;
        int tempData = FindLoop.indexOf(data, el);
        int expect = 5;
        assertThat(tempData, is(expect));
    }

    @Test
    public void whenArrayHas7Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}