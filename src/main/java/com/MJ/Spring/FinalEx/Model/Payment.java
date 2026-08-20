package com.MJ.Spring.FinalEx.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    private String reservationId; // links back to the Reservation being paid for
    private double amount;
    private String method;        // e.g. "CREDIT_CARD", "PAYPAL", "DEBIT_CARD"
    private String status;        // e.g. "PENDING", "COMPLETED", "FAILED"

    public Payment() {
    }

    public Payment(String reservationId, double amount, String method, String status) {
        this.reservationId = reservationId;
        this.amount = amount;
        this.method = method;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}