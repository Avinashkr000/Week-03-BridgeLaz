package com.day05.stringbuffer.problem1;

public class Compare {
    public static void main(String[] args) {
        final int iterations = 1000000;
        String str = "hello";

        long bufferStart = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append(str);
        }
        String bufferResult = buffer.toString();
        long bufferEnd = System.nanoTime();
        long bufferTime = bufferEnd - bufferStart;


        long builderStart = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append(str);
        }
        String builderResult = builder.toString();
        long builderEnd = System.nanoTime();
        long builderTime = builderEnd - builderStart;

        System.out.println("StringBuffer time: " + bufferTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");
    }
}