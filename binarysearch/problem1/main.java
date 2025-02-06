package org.day04.binarysearch.problem1;

import static org.day04.binarysearch.problem1.RotationPointFinder.findRotationPoint;

public class main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + rotationIndex);
        System.out.println("Smallest Element: " + arr[rotationIndex]);
    }
}
