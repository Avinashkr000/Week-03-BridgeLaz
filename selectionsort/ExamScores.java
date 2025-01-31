import static com.day03.selectionsort.SelectionSort.selectionSort;

public static void main(String[] args) {
    int[] examScores = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Exam Scores:");
    printArray(examScores);

    selectionSort(examScores);

    System.out.println("\nSorted Exam Scores in Ascending Order:");
    printArray(examScores);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}