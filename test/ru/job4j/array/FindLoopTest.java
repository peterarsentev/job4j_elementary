package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int value = 5;
        int[] data = {5, 7, 0, 4};
        int result = FindLoop.indexOf(data, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}