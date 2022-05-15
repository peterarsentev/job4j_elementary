package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.array.SwitchArray;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 5, 10, 18, 29};
        int source = 3;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 29, 18, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapMinus8toMinus3() {
        int[] input = {-8, 20, -3};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {-3, 20, -8};
        Assert.assertArrayEquals(expected, result);
    }
}
