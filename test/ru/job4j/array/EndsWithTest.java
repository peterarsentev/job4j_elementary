package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotEndWithThenFalse() {
        char[] word = {'S', 'e', 'p', 't', 'e'};
        char[] post = {'l', 'l', 'S', 'e', 'p', 't', 'e'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }
}
