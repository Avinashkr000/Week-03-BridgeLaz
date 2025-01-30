package com.linkedlist.doubly.moviemanagement;

public class Main {
    public static void main(String[] args) {
        // calling all methods
        MovieLinkedList list = new MovieLinkedList();
        list.insertAtBeginning("Inception", "Christopher Nolan", "2010", 8.8);
        list.insertAtBeginning("fdgdf", "Nolan", "2010", 8.8);
        list.insertAtLast("sdf", "Christopher", "2010", 8.8);
        list.insertAtPosition("dsafawe", "sdfawe", "2010", 8.8, 2);

//        list.searchForNode("Nolan");
        list.removeRecord("fdgdf");
//        System.out.println("------------------------------");
        list.displayAllForward();
        System.out.println("------------------------------");
//        list.displayAllReverse();
    }
}
