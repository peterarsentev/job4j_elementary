package ru.job4j.algorythm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Сортировки [#505155]
 * Задан массив из интервалов. Необходимо объединить перекрывающиеся интервалы.
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 1--2--3 это перекрывающиеся интревалы
 * 2--3--4--5--6  -> output [1,6]
 * Output: [[1,6],[8,10],[15,18]]
 */
public class IntervalMerger {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        result.add(currentInterval);
        return result.toArray(new int[result.size()][]);
    }
}
