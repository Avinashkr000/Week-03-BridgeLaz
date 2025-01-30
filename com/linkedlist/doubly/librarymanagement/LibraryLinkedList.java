package com.linkedlist.doubly.librarymanagement;

import com.linkedlist.doubly.moviemanagement.MovieNode;

public class LibraryLinkedList {
    private LibraryNode head;
    private LibraryNode tail;
    int size;

    // method for inserting node at first index
    public void insertAtBeginning(String bookTitle, String author, String genre, int bookId, boolean avaibilityStatus) {
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookId, avaibilityStatus);

        if(head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        this.head = newNode;

        this.size++;
    }

    // method for inserting node at last index
    public void insertAtLast(String bookTitle, String author, String genre, int bookId, boolean avaibilityStatus) {
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookId, avaibilityStatus);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    // method for inserting node at index
    public void insertAtPosition(String bookTitle, String author, String genre, int bookId, boolean avaibilityStatus, int index){
        LibraryNode newNode = new LibraryNode(bookTitle, author, genre, bookId, avaibilityStatus);
        if (size < index) {
            System.out.println("Index out of size");
            return;
        } else {
            LibraryNode temp = head;
            for(int i = 0; i<index-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        this.size++;
    }

    // method for removing node via id
    public void removeRecord(int id){
        LibraryNode temp = head;
        if(head.getBookId() == id){
            this.head = this.head.next;
            if(this.head != null) {
                this.head.prev = null;
            }
        }
        else {
            while(temp != null) {
                if(temp.getBookId() == id){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    break;
                }
                temp = temp.next;
            }
        }
        this.size--;
    }

    // method for searching node via title
    public void searchForNode(String title) {
        LibraryNode temp = head;
        while(temp != null) {
            if(temp.getBookTitle().equals(title)){
                System.out.println("Book details");
                System.out.println("Title: " + temp.getBookTitle());
                System.out.println("Author: " + temp.getAuthor());
                System.out.println("Genre: " + temp.getGenre());
                System.out.println("Book id: " + temp.getBookId());
                System.out.println("Avaibility status: " + temp.isAvaibilityStatus() + "\n");
                break;
            }
            temp = temp.next;
        }
    }

    // method for updating node from title
    public void updateRating(String title){
        LibraryNode temp = head;
        while(temp != null) {
            if(temp.getBookTitle().equals(title)){
                temp.setAvaibilityStatus(true);
                break;
            }
            temp = temp.next;
        }
    }

    // getting total books
    public int totalBooks(){
        int count = 0;
        LibraryNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // method for printing all node
    public void displayAllNode() {
        LibraryNode temp = head;
        while(temp != null) {
            System.out.println("Book details");
            System.out.println("Title: " + temp.getBookTitle());
            System.out.println("Author: " + temp.getAuthor());
            System.out.println("Genre: " + temp.getGenre());
            System.out.println("Book id: " + temp.getBookId());
            System.out.println("Avaibility status: " + temp.isAvaibilityStatus() + "\n");
            temp = temp.next;
        }
    }
}
