import static com.day03.bubblesort.BubbleSort.bubbleSort;

public static void main(String[] args) {
    int[] studentMarks = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Marks:");
    printArray(studentMarks);

    bubbleSort(studentMarks);

    System.out.println("\nSorted Marks in Ascending Order:");
    printArray(studentMarks);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}