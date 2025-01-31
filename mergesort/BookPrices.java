
import static com.day03.mergesort.MergeSort.mergeSort;

public static void main(String[] args) {
    int[] bookPrices = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Book Prices:");
    printArray(bookPrices);

    mergeSort(bookPrices, 0, bookPrices.length - 1);

    System.out.println("\nSorted Book Prices in Ascending Order:");
    printArray(bookPrices);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}

