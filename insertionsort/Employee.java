import static com.day03.insertionsort.InsertionSortEmployee.insertionSort;

public static void main(String[] args) {
    int[] employeeIDs = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Employee IDs:");
    printArray(employeeIDs);

    insertionSort(employeeIDs);

    System.out.println("\nSorted Employee IDs in Ascending Order:");
    printArray(employeeIDs);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}
