package org.day05.stringbuffer.problem2;

public class ConcatStrings {
    public static void main(String[] args) {
        String[] testArray = {"Hello", " ", "World", "!"};
        System.out.println(concatenateStrings(testArray));
    }

    public static String concatenateStrings(String[] array) {
        StringBuffer sb = new StringBuffer();
        for (String s : array) {
            sb.append(s);
        }
        return sb.toString();
    }
}
