package ru.job4j.cycles;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.cycles.Mortgage;

public class MortgageTest {

        @Test
        public void when1Year() {
            int amount = 1000;
            int salary = 1200;
            double percent = 50;
            int result = Mortgage.year(amount, salary, percent);
            int expected = 2;
            Assert.assertEquals(expected, result);
        }

        @Test
        public void when2Year() {
            int amount = 100;
            int salary = 120;
            double percent = 20;
            int result = Mortgage.year(amount, salary, percent);
            int expected = 1;
            Assert.assertEquals(expected, result);
        }

        @Test
        public void when3Year() {
            int amount = 10000;
            int salary = 3000;
            double percent = 15;
            int result = Mortgage.year(amount, salary, percent);
            int expected = 5;
            Assert.assertEquals(expected, result);
        }
    }
