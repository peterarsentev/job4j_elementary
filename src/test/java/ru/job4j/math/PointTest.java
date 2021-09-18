package ru.job4j.math;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.Point;

public class PointTest {

        @Test
        public void when00to20then2() {
            double expected = 5;
            Point a = new Point(0, 5);
            Point b = new Point(4, 8);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when1114to2114then10() {
            double expected = 10;
            Point a = new Point(11, 14);
            Point b = new Point(21, 14);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when08to028then20() {
            double expected = 20;
            Point a = new Point(0, 8);
            Point b = new Point(0, 28);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when83to1021then18() {
            double expected = 18.11;
            Point a = new Point(10, 12);
            Point b = new Point(8, 30);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }
}
