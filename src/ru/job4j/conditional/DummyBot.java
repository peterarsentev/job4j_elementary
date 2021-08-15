package ru.job4j.conditional;

public class DummyBot {
    public static String answer(String question) {
    String rsl = "Это ставит меня в тупик. Задайте другой вопрос";
        if ("Привет, Бот".equals(question)) {
            rsl = "Привет, умник";
        }
        if ("Пока".equals(question)) {
            rsl = "До скорой встречи";
        }
        if ("Когда он вернётся?".equals(question)) {
            rsl = "В сентябре либо в начале октября";
        } else if ("Какой сегодня день недели?".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);
        rsl = DummyBot.answer("Какой сегодня день недели?");
        System.out.println(rsl);
        rsl = DummyBot.answer("Когда он вернётся?");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока!");
        System.out.println(rsl);
    }
}
