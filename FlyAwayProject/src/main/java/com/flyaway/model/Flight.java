package com.flyaway.model;

public class Flight {
    private int id;
    private String source;
    private String destination;
    private String airline;
    private double ticketPrice;

    // Default constructor
    public Flight() {
    }

    // Parameterized constructor
    public Flight(int id, String source, String destination, String airline, double ticketPrice) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.airline = airline;
        this.ticketPrice = ticketPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
