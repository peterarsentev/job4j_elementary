package ru.job4j.add;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GetMaxCountTest {

    @Test
    void getMaxCount() {
        String str = "Мама мыла раму";
        char result = GetMaxCount.getMaxCount(str);
        char expected = 'а';
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getMaxCount1() {
        String str = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        char result = GetMaxCount.getMaxCount(str);
        char expected = 'о';
        assertThat(result).isEqualTo(expected);
    }
}
