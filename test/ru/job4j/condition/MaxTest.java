package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax8To2To6ThenOther() {
        int result = Max.max(8, 2, 6);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax9To6To4ThenOther() {
        int result = Max.max(6, 9, 4);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax9To4To6ThenOther() {
        int result = Max.max(6, 4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax9To4To6To3() {
        int result = Max.max(6, 4, 9, 3);
        assertThat(result, is(9));
    }
}