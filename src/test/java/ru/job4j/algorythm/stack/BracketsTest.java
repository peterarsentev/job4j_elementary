package ru.job4j.algorythm.stack;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BracketsTest {
    private final Brackets brackets = new Brackets();

    @Test
    public void givenValidBracketsWhenIsValidThenTrue() {
        assertThat(brackets.isValid("()")).isTrue();
        assertThat(brackets.isValid("()[]{}")).isTrue();
        assertThat(brackets.isValid("{[]}")).isTrue();
    }

    @Test
    public void givenInvalidBracketsWhenIsValidThenFalse() {
        assertThat(brackets.isValid("(]")).isFalse();
        assertThat(brackets.isValid("([)]")).isFalse();
        assertThat(brackets.isValid("]")).isFalse();
        assertThat(brackets.isValid("{")).isFalse();
        assertThat(brackets.isValid("")).isTrue();
    }
}
