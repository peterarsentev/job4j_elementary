package ru.job4j.conditional;

import org.junit.Test;
import ru.job4j.conditional.WeeklySalary;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class WeeklySalaryTest {

    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(690));
    }

    @Test
    public void calculateIs805() {
        int[] hours = {12, 11, 12, 8, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(925));
    }
}
