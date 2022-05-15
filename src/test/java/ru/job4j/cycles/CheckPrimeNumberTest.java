package ru.job4j.cycles;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.cycles.CheckPrimeNumber;

public class CheckPrimeNumberTest {

        @Test
        public void when5() {
            int number = 5;
            boolean result = CheckPrimeNumber.check(number);
            Assert.assertTrue(result);
        }

        @Test
        public void when4() {
            int number = 4;
            boolean result = CheckPrimeNumber.check(number);
            Assert.assertFalse(result);
        }

        @Test
        public void when1() {
            int number = 1;
            boolean result = CheckPrimeNumber.check(number);
            Assert.assertFalse(result);
        }

        @Test
        public void when311() {
        int number = 311;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
        }
        }
