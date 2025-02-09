package org.day06.problem1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        System.out.print("Enter target element to search : ");
        int target = sc.nextInt();
        SearchTarget searchTarget = new SearchTarget();
        boolean linear = searchTarget.linearSearchAnalysis(elements, target);
        boolean binary = searchTarget.binarySearchAnalysis(elements, target);
    }
}


