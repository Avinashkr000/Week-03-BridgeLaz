package com.linkedlist.doubly.moviemanagement;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;
    int size = 0;

    // method for inserting node at first index
    public void insertAtBeginning(String title, String director, String releaseYear, double rating) {
        MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    // method for inserting node at index
    public void insertAtPosition(String title, String director, String releaseYear, double rating, int index){
        MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
        if (size < index) {
            System.out.println("Index out of size");
            return;
        } else {
            MovieNode temp = head;
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

    // method for inserting node at last index
    public void insertAtLast(String title, String director, String releaseYear, double rating) {
        MovieNode newNode = new MovieNode(title, director, releaseYear, rating);
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

    // method for removing node via title
    public void removeRecord(String title){
        MovieNode temp = head;
        if(head.getTitle().equals(title)){
            this.head = this.head.next;
            if(this.head != null) {
                this.head.prev = null;
            }
        }
        else {
            while(temp != null) {
                if(temp.getTitle().equals(title)){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // method for serching node via director
    public void searchForNode(String director) {
        MovieNode temp = head;
        while(temp != null) {
            if(temp.getDirector().equals(director)){
                System.out.println("Movie details");
                System.out.println("Title: " + temp.getTitle());
                System.out.println("Director: " + temp.getDirector());
                System.out.println("Release Year: " + temp.getReleaseYear());
                System.out.println("Rating: " + temp.getRating() + "\n");
                break;
            }
            temp = temp.next;
        }
    }

    // method for update node from title and updating rating
    public void updateRating(String title, double rating){
        MovieNode temp = head;
        while(temp != null) {
            if(temp.getTitle().equals(title)){
                temp.setRating(rating);
                break;
            }
            temp = temp.next;
        }
    }

    // printing all nodes
    public void displayAllReverse(){
        MovieNode temp = tail;
        while(temp != null) {
            System.out.println("Movie details");
            System.out.println("Title: " + temp.getTitle());
            System.out.println("Director: " + temp.getDirector());
            System.out.println("Release Year: " + temp.getReleaseYear());
            System.out.println("Rating: " + temp.getRating() + "\n");
            temp = temp.prev;
        }
    }

    public void displayAllForward(){
        MovieNode temp = head;
        while(temp != null) {
            System.out.println("Movie details");
            System.out.println("Title: " + temp.getTitle());
            System.out.println("Director: " + temp.getDirector());
            System.out.println("Release Year: " + temp.getReleaseYear());
            System.out.println("Rating: " + temp.getRating() + "\n");
            temp = temp.next;
        }
    }
}
