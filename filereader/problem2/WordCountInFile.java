package com.day05.filereader.problem2;

import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        String targetWord = "example";  // Change this to the word you're searching for
        int wordCount = 0;

        try {
            FileReader fileReader = new FileReader("E:\\IDE\\TESTING\\src\\main\\java\\org\\day05\\filereader\\problem2\\input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }
            bufferedReader.close();
            System.out.println("The word '" + targetWord + "' appeared " + wordCount + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
