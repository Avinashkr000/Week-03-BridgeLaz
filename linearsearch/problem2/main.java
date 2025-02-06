package org.day04.linearsearch.problem2;

import static org.day04.linearsearch.problem2.LinearSearchWord.findSentenceWithWord;

public class main {
    public static void main(String[] args) {
        String[] sentences = {
                "The sky is blue.",
                "Java is a powerful language.",
                "I love programming.",
                "Practice makes perfect."
        };
        String word = "Java";
        System.out.println(findSentenceWithWord(sentences, word));
    }
}
