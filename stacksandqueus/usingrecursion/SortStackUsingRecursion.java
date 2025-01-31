package com.Day02.stacksandqueus.usingrecursion;


import java.util.Stack;

public class SortStackUsingRecursion {


    public static void sortedInsert(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
            return;
        }


        int temp = stack.pop();


        sortedInsert(stack, element);


        stack.push(temp);
    }


    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {

            int temp = stack.pop();


            sortStack(stack);


            sortedInsert(stack, temp);
        }
    }

}