package com.MJ.Spring.FinalEx.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {

    @Id
    private String id;
    private String customerId;

    private String firstName;
    private String lastName;
    private int numberOfPassengers;
    private String travelClass;   // e.g. Economy, Business, First
    private String phoneNumber;
    private String time;
    private String departureDate; // stored as String for simplicity (e.g. "2026-08-19")

    public Reservation() {
    }
    public Reservation(String customerId, String firstName, String lastName, int numberOfPassengers,
            			String travelClass, String phoneNumber, String time, String departureDate) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfPassengers = numberOfPassengers;
		this.travelClass = travelClass;
		this.phoneNumber = phoneNumber;
		this.time = time;
		this.departureDate = departureDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}