package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!name.isEmpty() && isLowerLatinLetter(name.charAt(0))) {
            for (char n : name.toCharArray()) {
                if (Character.isDigit(Character.codePointAt(name.toCharArray(), n))
                        || isSpecialSymbol(Character.codePointAt(name.toCharArray(), n))
                        || isUpperLatinLetter(Character.codePointAt(name.toCharArray(), n))
                        || isLowerLatinLetter(Character.codePointAt(name.toCharArray(), n))) {
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
