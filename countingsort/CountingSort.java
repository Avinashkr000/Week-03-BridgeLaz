package com.day03.countingsort;


public class CountingSort {

    public static void countingSort(int[] ages) {
        int n = ages.length;

        // Define the range of ages (10 to 18)
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        // Create a count array to store the frequency of each age
        int[] count = new int[range];

        // Store the count of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Modify the count array to store cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Create an output array to store sorted ages
        int[] output = new int[n];

        // Place each age in its correct position in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, ages, 0, n);
    }
}