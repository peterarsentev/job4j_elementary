package ru.job4j.algorythm.sort;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MergeTest {
    @Test
    public void whenSortedThenOk1() {
        int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
        assertThat(Merge.mergeSort(array)).containsExactly(-13, 2, 3, 4, 4, 6, 8, 10);
    }

    @Test
    public void whenSortedThenOk2() {
        int[] array = {10, 4, 6, -2, 8, -13, 0, 2, 3};
        assertThat(Merge.mergeSort(array)).containsExactly(-13, -2, 0, 2, 3, 4, 6, 8, 10);
    }

    @Test
    public void whenSortedThenOk3() {
        int[] array = {-10, -4, -6, -2, -8, -13, 0, -20, -3};
        assertThat(Merge.mergeSort(array)).containsExactly(-20, -13, -10, -8, -6, -4, -3, -2, 0);
    }
}
