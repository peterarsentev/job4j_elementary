package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
    public void when10to10then0() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        int expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
    public void when11to01then1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 1;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
    public void when01to21then2() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to2to3then2() {
        int x1 = 0;
        int y1 = 1;
        int z1 = 1;
        int x2 = 2;
        int y2 = 1;
        int z2 = 1;
        int expected = 2;
        double out = Point.distance3d(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to2to3then4() {
        int x1 = 3;
        int y1 = 2;
        int z1 = 2;
        int x2 = 0;
        int y2 = 5;
        int z2 = 2;
        double expected = 4.24;
        double out = Point.distance3d(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected, out, 0.01);
    }
}