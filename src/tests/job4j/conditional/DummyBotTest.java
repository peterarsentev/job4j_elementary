package ru.job4j.conditional;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот";
        String rsl = DummyBot.answer(in);
        String expected = "Привет, умник";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока";
        String rsl = DummyBot.answer(in);
        String expected = "До скорой встречи";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenAnotherQnBot() {
        String in = "Где ты планируешь отдыхать?";
        String rsl = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос";
        Assert.assertEquals(expected, rsl);
    }
}
