package ru.job4j.ex;

import java.util.Objects;

public class ElementNotFoundException extends Exception {
        public ElementNotFoundException(String message) {
            super(message);
        }

        public static class FindEl {
            public static int indexOf(String[] value, String key) throws ElementNotFoundException {
                int rsl = -1;
                for (String el : value) {
                    if (!key.equals(el)) {
                        throw new ElementNotFoundException("Element could not be found");
                    }
                }
                return rsl;
            }

            public static void main(String[] args) {
                try {
                    indexOf(new String[]{"Barcelona", "Rio", "Paris"}, "Rio");
                } catch (ElementNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
