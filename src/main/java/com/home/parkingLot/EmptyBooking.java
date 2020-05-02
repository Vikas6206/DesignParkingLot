package com.home.parkingLot;

//Null object pattern
public class EmptyBooking implements IBooking{

    @Override
    public String getBookingId() {
        return "Booking cannot be done .";
    }
}
