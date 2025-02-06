package org.day05.inputstreamreader.problem2;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter("E:\\IDE\\TESTING\\src\\main\\java\\org\\day05\\inputstreamreader\\problem2\\output.txt", true);
            String input;

            System.out.println("Enter text to write to the file (type 'exit' to stop/or close):");

            while (!(input = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input + System.lineSeparator());
            }


            bufferedReader.close();
            fileWriter.close();
            System.out.println("Input has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
