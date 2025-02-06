package org.day04.binarysearch.problem4;

import static org.day04.binarysearch.problem4.FirstLastOccurrence.findFirstAndLast;

public class main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = findFirstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
