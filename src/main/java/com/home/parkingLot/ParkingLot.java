package com.home.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Level> levelList;
    private List<Booking> bookingList;

    public ParkingLot() {
        this.levelList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
    }

    public List<Level> getLevelList() {
        return levelList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }
}
