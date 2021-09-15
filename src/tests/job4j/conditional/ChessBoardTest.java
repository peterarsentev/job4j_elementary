package ru.job4j.conditional;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 4;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs7() {
        int x1 = 7;
        int y1 = 7;
        int x2 = 0;
        int y2 = 0;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 4;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 7;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 8;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0() {
        int x1 = 0;
        int y1 = 7;
        int x2 = 5;
        int y2 = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 7;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 4;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
    }
