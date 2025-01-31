import static com.day03.quicksort.QuickSort.quickSort;

public static void main(String[] args) {
    int[] productPrices = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Product Prices:");
    printArray(productPrices);

    quickSort(productPrices, 0, productPrices.length - 1);

    System.out.println("\nSorted Product Prices in Ascending Order:");
    printArray(productPrices);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}