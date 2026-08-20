package com.MJ.Spring.FinalEx.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
public class Ticket {

    @Id
    private String id;

    private String reservationId; // links back to the Reservation this ticket was issued for
    private String flightNumber;
    private String seatNumber;
    private String travelClass;   // Economy, Business, First
    private String status;        // e.g. "ISSUED", "CANCELLED", "CHECKED_IN"

    public Ticket() {
    }

    public Ticket(String reservationId, String flightNumber, String seatNumber,
                   String travelClass, String status) {
        this.reservationId = reservationId;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}