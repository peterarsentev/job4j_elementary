package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!name.isEmpty() && isLowerLatinLetter(name.charAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))
                        || isSpecialSymbol(name.charAt(i))
                        || isUpperLatinLetter(name.charAt(i))
                        || isLowerLatinLetter(name.charAt(i))) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
