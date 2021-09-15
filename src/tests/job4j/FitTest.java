package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.Fit;

public class FitTest {

        @Test
        public void whenMan197Then111()  {
        short in = 197;
        double expected = 111.55;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
        public void whenWoman162Then59() {
        short in = 162;
        double expected = 59.8;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
