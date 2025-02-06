package org.day05.inputstreamreader.problem1;

import java.io.*;

public class ByteToCharStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\IDE\\TESTING\\src\\main\\java\\org\\day05\\inputstreamreader\\problem1\\input.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
