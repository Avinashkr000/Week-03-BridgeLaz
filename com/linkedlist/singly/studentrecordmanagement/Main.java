package com.linkedlist.singly.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.insertAtBeginning(123, "saurabh", 23, "A");
        list.insertAtBeginning(12345, "Uday", 25, "B");
        list.insertAtLast(253, "Nishant", 25, "C");
        list.insertAtIndex(25323, "pankaj", 24, "C", 1);
        list.deleteByIndex(1);
        list.updateByRollNumber(253, "A");
        list.searchByIndex(253);
        list.displayAllNode();
        System.out.println(list.getSize());
    }
}
