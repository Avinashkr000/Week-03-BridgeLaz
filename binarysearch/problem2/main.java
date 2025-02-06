package org.day04.binarysearch.problem2;

import static org.day04.binarysearch.problem2.PeakElementFinder.findPeakElement;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}
