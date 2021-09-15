package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {24, 38, 100, 83, 42};
        int[] result = Turn.back(input);
        int[] expected = new int[] {42, 83, 100, 38, 24};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray2() {
        int[] input = new int[] {221, 250, 100, 1000, 420, 528, 704};
        int[] result = Turn.back(input);
        int[] expected = new int[] {704, 528, 420, 1000, 100, 250, 221};
        Assert.assertArrayEquals(expected, result);
    }
}
