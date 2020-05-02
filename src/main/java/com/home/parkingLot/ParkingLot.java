package com.home.parkingLot;

import java.util.List;

public class ParkingLot {
    private List<Level> levelList;
    private List<Booking> bookingList;

    public ParkingLot(List<Level> levelList, List<Booking> bookingList) {
        this.levelList = levelList;
        this.bookingList = bookingList;
    }

    public List<Level> getLevelList() {
        return levelList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }
}
