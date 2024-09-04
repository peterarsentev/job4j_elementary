package ru.job4j.algorythm.stack;

import java.util.Stack;

public class Brackets {
    public static boolean match(char a, char b) {
        return (a == '(' && b == ')')
                || (a == '{' && b == '}')
                || (a == '[' && b == ']');
    }

    public boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        char[] array = string.toCharArray();
        for (char c : array) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !match(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
