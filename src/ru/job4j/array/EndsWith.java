package ru.job4j.array;

public class EndsWith {
        public static boolean endsWith(char[] word, char[] post) {
            boolean result = true;
            for (int i = 0; i < post.length; i++) {
                if (word[word.length - i - 1] != post[post.length - i - 1]) {
                    result = false;
                }
            }

            return result;
        }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        EndsWith.endsWith(word, post);
    }
}
