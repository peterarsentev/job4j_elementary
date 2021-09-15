package ru.job4j.ex;

import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void when0to2then3() {
        int rsl = Fact.calc(-1);
        assertThat(rsl, is("Input should be positive number."));
    }
}
