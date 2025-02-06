package org.day04.challengeproblem;

import static org.day04.challengeproblem.SearchProblems.binarySearch;
import static org.day04.challengeproblem.SearchProblems.findFirstMissingPositive;

public class main {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;

        int missing = findFirstMissingPositive(nums);
        System.out.println("First missing positive: " + missing);

        int index = binarySearch(nums, target);
        System.out.println("Index of target: " + index);
    }
}
