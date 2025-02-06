
package org.day05.challengeproblem;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Comparison {

    public static void performanceTest(){
        long startTime,endTime;

        //Testing String Builder Performance
        startTime=System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }
        endTime=System.nanoTime();
        System.out.println("String Builder Time: "+(endTime-startTime)+" ns");

        //Testing String Buffer Performance
        startTime=System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sbf.append("hello");
        }

        endTime =System.nanoTime();
        System.out.println("String Buffer Time: "+(endTime-startTime)+" ns");
        System.out.println();
    }

    public static void readUsingFileReader() {
        Reader fr = null;
        long startTime,endTime;

        try {
            // Create a FileReader object to read from the file
            fr = new FileReader("E:\\IDE\\TESTING\\src\\main\\java\\org\\day05\\challengeproblem\\input.txt");
            int ch;

            StringBuffer sb = new StringBuffer();
            startTime=System.nanoTime();
            // Use a loop to read each line using the readLine() method
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
                sb.append((char)ch);
            }

            endTime=System.nanoTime();
            String str = sb.toString();
            String words[] = str.split(" ");
            int countWord =words.length;
            System.out.println();
            System.out.println("\nTime Taken by FileReader:"+(endTime-startTime)+" ns");
            System.out.println("Total words read: " + countWord);
            System.out.println();
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("Cannot open file: " + fileNotFound);
        } catch (IOException ex) {
            System.out.println("Error while reading the file ");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.println("Error while closing the file");
                }
            }
        }
    }

    public static void readUsingInputStreamReader() {
        long startTime,endTime;
        FileInputStream fis = null;
        try {
            // Create a FileInputStream object to read from the file
            fis = new FileInputStream("D:/CapgeminiTraining/aboutJava.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            int ch;
            int count = 0;

            StringBuffer sb = new StringBuffer();
            startTime=System.nanoTime();
            // Use a loop to read each line using the readLine() method
            while ((ch = isr.read()) != -1) {
                System.out.print((char)ch);
                sb.append((char)ch);
            }
            endTime=System.nanoTime();
            String str = sb.toString();
            String words[] = str.split(" ");
            int countWord =words.length;
            System.out.println();
            System.out.println("\nTime Taken by InputStreamReader: "+(endTime-startTime)+" ns");
            System.out.println("Total words read:" + countWord);
            System.out.println();
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("Cannot open file: " + fileNotFound);
        } catch (IOException ex) {
            System.out.println("Error while reading the file ");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println("Error while closing the file");
                }
            }
        }
    }
}
