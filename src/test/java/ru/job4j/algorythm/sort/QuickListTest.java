package ru.job4j.algorythm.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class QuickListTest {

    @Test
    public void whenReverseOrderThenOk() {
        Comparator<Integer> comparator = (a, b) -> b - a;
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-8);
        list.add(1);
        list.add(0);
        list.add(10);
        list.add(1);
        list.add(8);
        QuickList.quickSort(list, comparator);
        assertThat(list).containsExactly(10, 8, 1, 1, 0, -2, -8);
    }

    @Test
    public void whenReverseOrderThenOk2() {
        Comparator<Integer> comparator = Comparator.comparingInt(a -> a);
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-8);
        list.add(1);
        list.add(0);
        list.add(10);
        list.add(1);
        list.add(8);
        QuickList.quickSort(list, comparator);
        assertThat(list).containsExactly(-8, -2, 0, 1, 1, 8, 10);
    }

    @Test
    public void whenSortThenOk() {
        User user1 = new User(1, "11");
        User user2 = new User(1, "22");
        User user3 = new User(3, "33");
        User user4 = new User(-4, "44");
        User user5 = new User(4, "55");
        User user6 = new User(6, "66");
        Comparator<User> comparator = Comparator.comparingInt(User::getId);
        List<User> listUser = new ArrayList<>();
        listUser.add(user3);
        listUser.add(user5);
        listUser.add(user1);
        listUser.add(user4);
        listUser.add(user6);
        listUser.add(user2);
        QuickList.quickSort(listUser, comparator);
        List<Integer> result = listUser.stream().map(User::getId).toList();
        assertThat(result).containsExactly(-4, 1, 1, 3, 4, 6);
    }

    @Test
    public void checkQuickSort() {
        List<User> listUser = Arrays.asList(
                new User(-4, "44"),
                new User(1, "11"),
                new User(3, "33"),
                new User(6, "66"),
                new User(1, "22"),
                new User(4, "55")
        );
        Comparator<User> comparator = Comparator.comparing(user ->
                Integer.parseInt(user.getName()), Comparator.reverseOrder());
        QuickList.quickSort(listUser, comparator);
        List<String> result = listUser.stream().map(User::getName).toList();
        assertThat(result).containsExactly("66", "55", "44", "33", "22", "11");
    }

    @Test
    public void whenInputArrayEmptyThenReturnEmpty() {
        Comparator<Integer> comparator = (a, b) -> b - a;
        List<Integer> list = new ArrayList<>();
        QuickList.quickSort(list, comparator);
        assertThat(list).isEqualTo(List.of());
        assertThat(list).containsExactly();
    }

    private static class User {
        private final Integer id;
        private final String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
