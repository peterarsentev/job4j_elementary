package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.SqArea;

public class SqAreaTest {

        @Test
        public void whenP6K2Square2() {
            int expected = 2;
            int p = 6;
            double k = 2;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void whenP60K5Square125() {
        int expected = 125;
        int p = 60;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP80K3Square300() {
        int expected = 300;
        int p = 80;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP340K7Square3000() {
        int expected = 3000;
        int p = 340;
        double k = 7.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
