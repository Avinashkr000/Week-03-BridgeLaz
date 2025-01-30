package com.linkedlist.circular.onlineticketreservation;

public class Main {
    public static void main(String[] args) {
        // calling all methods
        TicketLinkedList list = new TicketLinkedList();
        list.insertAtLast(1, "Uday", "Mufasa", "A3", "3:00PM");
        list.insertAtLast(2, "Saurabh", "Animal", "A3", "3:00PM");
        list.insertAtLast(3, "Nishant", "Mufasa", "A3", "3:00PM");
        list.insertAtLast(4, "Pankaj", "Mufasa", "A3", "3:00PM");
        list.removeById(3);
        list.searchByCustomerName("Uday");
        list.searchByMovieName("Animal");
        list.displayAllNodes();

        System.out.println("Total tickets are: " + list.totalTickets());
    }
}
