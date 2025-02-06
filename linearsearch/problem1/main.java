package org.day04.linearsearch.problem1;

import static org.day04.linearsearch.problem1.LinearSearchFirstNegative.findFirstNegative;

public class main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 0, -5, 9, -2};
        System.out.println(findFirstNegative(arr));
    }
}