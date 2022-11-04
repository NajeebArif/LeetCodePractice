package narif.poc.leetcode.easy;

import java.util.*;
import java.util.stream.IntStream;

public class ReverseVowels {

    private Set<String> vowels = new HashSet<>(List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));

    public String reverseVowels(String input) {
        String[] chars = input.split("");
        Stack<String> strings = new Stack<>();
        pushVowelsToStack(chars, strings);
        popVowelsFromStack(chars, strings);
        return String.join("", chars);
    }

    private void pushVowelsToStack(String[] chars, Stack<String> strings) {
        IntStream.range(0, chars.length).filter(i -> vowels.contains(chars[i])).forEach(i -> {
            strings.push(chars[i]);
            chars[i] = "";
        });
    }

    private static void popVowelsFromStack(String[] chars, Stack<String> strings) {
        IntStream.range(0, chars.length)
                .filter(i -> Objects.equals(chars[i], ""))
                .forEach(i -> chars[i] = strings.pop());
    }
}
