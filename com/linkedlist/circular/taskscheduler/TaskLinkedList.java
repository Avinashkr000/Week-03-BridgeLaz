package com.linkedlist.circular.taskscheduler;

import com.linkedlist.singly.studentrecordmanagement.StudentNode;

public class TaskLinkedList {
    private TaskNode head;
    private TaskNode tail;
    int size = 0;

    // method for inserting node at first index
    public void insertAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (this.head == null) {
            newNode.next = newNode;
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = newNode;
        }
        this.size++;
    }

    // method for inserting node at last index
    public void insertAtLast(int taskId, String taskName, int priority, String dueDate){
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if(tail == null) {
            insertAtBeginning(taskId, taskName, priority, dueDate);
        }
        else {
            tail.next = newNode;
            newNode.next = head;
            this.tail = newNode;
        }
        size++;
    }

    // method for inserting node at index
    public void insertAtIndex(int taskId, String taskName, int priority, String dueDate, int index) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            insertAtBeginning(taskId, taskName, priority, dueDate);
        } else {
            TaskNode temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (index == size) {
                this.tail = newNode;
            }
        }
        size++;
    }

    // method for removing node from task id
    public void removeTask(int taskId) {
        if (head == null) {
            return;
        }

        TaskNode temp = head;

        if (head.getTaskId() == taskId) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else {
            do {
                temp = temp.next;
            } while(temp.next.getTaskId() != taskId);

            temp.next = temp.next.next;
        }
        size--;
    }

    // method for searching node from priority
    public void searchByPriority(int priority){
        if (head == null) {
            return;
        }

        TaskNode temp = this.head;

        do{
            if(temp.getPriority() == priority) {
                System.out.println("Task details: ");
                System.out.println("Task id: " + temp.getTaskId() + "\nTask Name: " + temp.getTaskName() + "\nPriority: " + temp.getPriority() + "\nDue Date: " + temp.getDueDate() +"\n");
                break;
            }
            temp = temp.next;
        }
        while(temp != head);
    }

    // method for Printing all nodes
    public void displayAllNode(){
        if (head == null) {
            return;
        }

        TaskNode temp = this.head;

        do{
            System.out.println("Task details: ");
            System.out.println("Task id: " + temp.getTaskId() + "\nTask Name: " + temp.getTaskName() + "\nPriority: " + temp.getPriority() + "\nDue Date: " + temp.getDueDate() +"\n");
            temp = temp.next;
        }
        while(temp != head);
    }
}
