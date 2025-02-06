package com.day05.filereader.problem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "E:\\IDE\\Week-03\\src\\com\\day05\\filereader\\problem1\\test.txt";
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e) {
            System.err.println("Error in the reading file : " + e.getMessage());
        }
    }
}