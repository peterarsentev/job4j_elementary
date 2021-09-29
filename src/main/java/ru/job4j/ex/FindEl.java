package ru.job4j.ex;

public class FindEl {
    public static void indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int el = 0; el < value.length; el++) {
            if (value[el].equals(key)) {
                rsl = el;
                break;
            }
        }
        if (rsl == -1) {
        throw new ElementNotFoundException("Element could not be found");
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"Barcelona", "Rio", "Paris"}, "Lisbon");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
