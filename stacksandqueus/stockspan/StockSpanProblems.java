package com.Day02.stacksandqueus.stockspan;


import java.util.Stack;

public class StockSpanProblems {

    // Method to calculate the stock span
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Array to store the span values
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of prices

        // Initialize the span for the first day
        span[0] = 1;
        stack.push(0);

        // Calculate the span for the remaining days
        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the current price is greater than the price at the index on top of the stack
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, the current price is the highest so far
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, the span is the difference between the current index and the index on top of the stack
                span[i] = i - stack.peek();
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }

}