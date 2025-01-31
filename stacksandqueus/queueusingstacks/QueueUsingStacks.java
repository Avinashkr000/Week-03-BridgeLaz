package com.Day02.stacksandqueus;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> stackEnqueue; // Stack for enqueue operations
    private Stack<Integer> stackDequeue; // Stack for dequeue operations

    // Constructor to initialize the stacks
    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int item) {
        stackEnqueue.push(item);
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            // Transfer all elements from stackEnqueue to stackDequeue
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (stackDequeue.isEmpty()) {
            // Transfer all elements from stackEnqueue to stackDequeue
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.peek();
    }
}