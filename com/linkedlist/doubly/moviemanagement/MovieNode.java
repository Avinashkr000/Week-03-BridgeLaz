package com.linkedlist.doubly.moviemanagement;

public class MovieNode {
    // attributes
    private String title;
    private String director;
    private String releaseYear;
    private double rating;
    MovieNode prev;
    MovieNode next;

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public MovieNode getPrev() {
        return prev;
    }

    public void setPrev(MovieNode prev) {
        this.prev = prev;
    }

    public MovieNode getNext() {
        return next;
    }

    public void setNext(MovieNode next) {
        this.next = next;
    }

    // constructors
    public MovieNode(String title, String director, String releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
