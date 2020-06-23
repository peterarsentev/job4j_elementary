package ru.job4j.calculator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class FitTest {

    @Test
    public void whenManWeight187Then100() {
        double height = 187;
        double expected = 100.05;
        double man = Fit.manWeight(height);
        assertThat(man, is(expected));
    }

    @Test
    public void wenWomanWeight187Then88() {
        double height = 187;
        double expected = 88.55;
        double woman = Fit.womanWeight(height);
        assertThat(woman, is(expected));
    }
}