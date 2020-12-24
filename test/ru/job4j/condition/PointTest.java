package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when13to56then5() {
        int expected = 5;
        int x1 = 1;
        int y1 = 3;
        int x2 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when74to49then583() {
        double expected = 5.83;
        int x1 = 7;
        int y1 = 4;
        int x2 = 4;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1016to258then17() {
        int expected = 17;
        int x1 = 10;
        int y1 = 16;
        int x2 = 25;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}