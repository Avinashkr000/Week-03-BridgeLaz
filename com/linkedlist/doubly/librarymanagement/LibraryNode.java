package com.linkedlist.doubly.librarymanagement;

public class LibraryNode {
    // attributes
    private String bookTitle;
    private String author;
    private String genre;
    private int bookId;
    private boolean avaibilityStatus;
    LibraryNode next;
    LibraryNode prev;

    // getters and setters
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isAvaibilityStatus() {
        return avaibilityStatus;
    }

    public void setAvaibilityStatus(boolean avaibilityStatus) {
        this.avaibilityStatus = avaibilityStatus;
    }

    // constructors
    public LibraryNode(String bookTitle, String author, String genre, int bookId, boolean avaibilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.avaibilityStatus = avaibilityStatus;
        this.next = null;
        this.prev = null;
    }
}
