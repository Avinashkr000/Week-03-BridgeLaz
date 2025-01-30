package com.linkedlist.circular.onlineticketreservation;

public class TicketLinkedList {
    private TicketNode head;
    private TicketNode tail;
    int size;

    // method for inserting node at last index
    public void insertAtLast(int movieId, String customerName, String movieName, String seatNumber, String bookingTime){
        TicketNode newNode = new TicketNode(movieId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.next = head;
            this.tail = newNode;
        }
        this.size++;
    }

    // method for removing node at index
    public void removeById(int ticketId) {
        if (head == null) {
            return;
        }

        TicketNode temp = head;

        if (head.getMovieId() == ticketId) {
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
            } while(temp.next.getMovieId() != ticketId);

            temp.next = temp.next.next;
        }
        size--;
    }

    // method for searching node from name
    public void searchByCustomerName(String name){
        if (head == null) {
            return;
        }

        TicketNode temp = this.head;

        do{
            if(temp.getCustomerName().equals(name)) {
                System.out.println("Ticket details: ");
                System.out.println("Movie Id: " +  temp.getMovieId() + "\nCustomer Name: " + temp.getCustomerName() +  "\nMovie name: " + temp.getMovieName() + "\nSeat Number: " + temp.getSeatNumber() + "\nBooking time: " + temp.getBookingTime() + "\n");
                break;
            }
            temp = temp.next;
        }
        while(temp != head);
    }

    // method for searching node from name
    public void searchByMovieName(String name){
        if (head == null) {
            return;
        }

        TicketNode temp = this.head;

        do{
            if(temp.getMovieName().equals(name)) {
                System.out.println("Ticket details: ");
                System.out.println("Movie Id: " +  temp.getMovieId() + "\nCustomer Name: " + temp.getCustomerName() +  "\nMovie name: " + temp.getMovieName() + "\nSeat Number: " + temp.getSeatNumber() + "\nBooking time: " + temp.getBookingTime() + "\n");
                break;
            }
            temp = temp.next;
        }
        while(temp != head);
    }

    // method for getting total tickets
    public int totalTickets(){
        int count = 0;
        if (head == null) {
            return count;
        }
        TicketNode temp = this.head;
        do{
            count++;
            temp = temp.next;
        }
        while (temp != head);

        return count;
    }

    // printing all
    public void displayAllNodes(){
        if (head == null) {
            return;
        }
        TicketNode temp = this.head;
        do{
            System.out.println("Ticket details:");
            System.out.println("Movie Id: " +  temp.getMovieId() + "\nCustomer Name: " + temp.getCustomerName() +  "\nMovie name: " + temp.getMovieName() + "\nSeat Number: " + temp.getSeatNumber() + "\nBooking time: " + temp.getBookingTime() + "\n");
            temp = temp.next;
        }
        while (temp != head);
    }
}
