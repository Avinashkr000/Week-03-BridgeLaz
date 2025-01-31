import static com.day03.countingsort.CountingSort.countingSort;

public static void main(String[] args) {
    int[] studentAges = {12, 15, 10, 18, 14, 12, 16, 10, 11, 17};

    System.out.println("Original Student Ages:");
    printArray(studentAges);

    countingSort(studentAges);

    System.out.println("\nSorted Student Ages in Ascending Order:");
    printArray(studentAges);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}
