package com.linkedlist.doubly.librarymanagement;

public class Main {
    public static void main(String[] args) {
        // calling all methods
        LibraryLinkedList list = new LibraryLinkedList();
        list.insertAtLast("Something", "Someone", "Something", 4, false);
        list.insertAtBeginning("Something", "Someone", "Something", 3, false);
        list.insertAtBeginning("Something", "Someone", "Something", 2, false);
        list.insertAtBeginning("xyz", "Someone", "Something", 1, false);
        list.insertAtPosition("Something", "Someone", "Something", 5, false, 3);
        list.removeRecord(3);
        list.updateRating("xyz");
        list.searchForNode("xyz");
        System.out.println(list.totalBooks());
        list.displayAllNode();
    }
}
