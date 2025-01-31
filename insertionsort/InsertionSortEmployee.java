package com.day03.insertionsort;


public class InsertionSortEmployee {

    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j + 1] = key;
        }
    }
}