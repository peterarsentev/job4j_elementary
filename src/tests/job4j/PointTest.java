package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.Point;

public class PointTest {

        @Test
        public void when00to20then2() {
            double expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when1114to2114then10() {
            double expected = 10;
            int x1 = 11;
            int y1 = 14;
            int x2 = 21;
            int y2 = 14;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when08to028then20() {
            double expected = 20;
            int x1 = 0;
            int y1 = 8;
            int x2 = 0;
            int y2 = 28;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when83to1021then18() {
            double expected = 18.11;
            int x1 = 8;
            int y1 = 3;
            int x2 = 10;
            int y2 = 21;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }
}
