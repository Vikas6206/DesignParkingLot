package com.home.parkingLot;

import java.util.UUID;

public class Payment {
    private String bookingId;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;

    public Payment(String bookingId, PaymentStatus paymentStatus, PaymentMode paymentMode) {
        this.bookingId = bookingId;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = UUID.randomUUID().toString();
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
