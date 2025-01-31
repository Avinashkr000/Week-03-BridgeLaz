import static com.Day02.stacksandqueus.slidingwindow.SlidingWindow.maxSlidingWindow;

public static void main(String[] args) {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;

    System.out.println("Input Array:");
    printArray(nums);

    int[] result = maxSlidingWindow(nums, k);

    System.out.println("Maximum in Each Sliding Window of Size " + k + ":");
    printArray(result);
}

public static void printArray(int[] arr) {
    for (int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
}
