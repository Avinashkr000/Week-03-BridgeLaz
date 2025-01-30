package com.linkedlist.circular.onlineticketreservation;

public class TicketNode {
    // attributes
    private int movieId;
    private String movieName;
    private String seatNumber;
    private String bookingTime;
    private String customerName;

    // getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    TicketNode next;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    // constructor
    public TicketNode(int movieId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.customerName = customerName;
        this.next = null;
    }
}
