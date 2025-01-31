import static com.Day02.stacksandqueus.stockspan.StockSpanProblems.calculateStockSpan;

public static void main(String[] args) {
    int[] prices = {100, 80, 60, 70, 60, 75, 85};

    System.out.println("Stock Prices:");
    printArray(prices);

    int[] span = calculateStockSpan(prices);

    System.out.println("Stock Spans:");
    printArray(span);
}

// Utility method to print an array
public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}
