package ru.job4j.conditional;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
        public void whenExist() {
            double ab = 24.0;
            double ac = 25.0;
            double bc = 26.0;
            boolean result = Triangle.exist(ab, ac, bc);
            Assert.assertTrue(result);
        }

    @Test
    public void whenNotExist() {
        double ab = 24.0;
        double ac = 25.0;
        double bc = 26.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}
