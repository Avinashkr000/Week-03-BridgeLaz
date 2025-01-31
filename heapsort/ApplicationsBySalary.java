import static com.day03.heapsort.HeapSort.heapSort;

public static void main(String[] args) {
    int[] salaryDemands = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Salary Demands:");
    printArray(salaryDemands);

    heapSort(salaryDemands);

    System.out.println("\nSorted Salary Demands in Ascending Order:");
    printArray(salaryDemands);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}