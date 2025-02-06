package com.day05.stringbuilder.problem2;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "abcdeabdcdedabce";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }
}