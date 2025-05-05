package com.redhat;

public class Flight {
    public String flightNumber;
    public String status;
    public String departureTime;
    public String origin;
    public String destination;
    public String gate;

    public Flight() {
        
    }
    

    public Flight(String flightNumber, String status, String departureTime, String origin, String destination,
            String gate) {
        this.flightNumber = flightNumber;
        this.status = status;
        this.departureTime = departureTime;
        this.origin = origin;
        this.destination = destination;
        this.gate = gate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getGate() {
        return gate;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }
    
    
}
