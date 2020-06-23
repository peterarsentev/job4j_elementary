package ru.job4jcondition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result, is(expected));
    }
}