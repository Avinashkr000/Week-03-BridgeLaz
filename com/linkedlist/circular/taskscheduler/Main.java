package com.linkedlist.circular.taskscheduler;

public class Main {
    public static void main(String[] args) {
        // calling all methods
        TaskLinkedList list = new TaskLinkedList();
        list.insertAtBeginning(4, "Somthing", 2, "3/3/23");
        list.insertAtBeginning(3, "Somthi435ng", 2, "3/3/23");
        list.insertAtBeginning(2, "Somertwe4tthing", 8, "3/3/23");
        list.insertAtBeginning(1, "Somthing", 2, "3/3/23");
        list.insertAtLast(5, "Somthing", 2, "3/3/23");
        list.insertAtIndex(6, "Somthing", 2, "3/3/23", 5);
//        list.removeTask(1);
        list.searchByPriority(8);
//        list.displayAllNode();
    }
}
