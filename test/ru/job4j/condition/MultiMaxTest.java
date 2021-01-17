package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 4, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenNumbersSame() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenNumbers12Same() {
        int result = MultiMax.max(5, 5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenNumbers23Same() {
        int result = MultiMax.max(6, 4, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenNumbers13Same() {
        int result = MultiMax.max(6, 4, 6);
        assertThat(result, is(6));
    }
}