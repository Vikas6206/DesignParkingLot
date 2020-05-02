package com.home.parkingLot;

import java.util.List;
import java.util.UUID;

public class Booking implements IBooking{
    private String bookingId;
    private Vehicle vehicle;
    private  int levelNo;
    private  int rowNo;
    private List<Slot> slotList;
    private long vehicleInTime;

    public Booking( BookingBuilder bookingBuilder ) {
        this.bookingId = bookingBuilder.bookingId;
        this.vehicle = bookingBuilder.vehicle;
        this.levelNo = bookingBuilder.levelNo;
        this.rowNo = bookingBuilder.rowNo;
        this.slotList = bookingBuilder.slotList;
        this.vehicleInTime = bookingBuilder.vehicleInTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public int getRowNo() {
        return rowNo;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public long getVehicleInTime() {
        return vehicleInTime;
    }

    //@vkumar: At the time of booking the vehicle out time and payment won't be available
    private long vehicleOutTime;
    private Payment payment;

    public void setVehicleOutTime(long vehicleOutTime) {
        this.vehicleOutTime = vehicleOutTime;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public long getVehicleOutTime() {
        return vehicleOutTime;
    }

    public Payment getPayment() {
        return payment;
    }

    //Using builder pattern to create Booking object
    public static class BookingBuilder{
        private String bookingId;
        private Vehicle vehicle;
        private  int levelNo;
        private  int rowNo;
        private List<Slot> slotList;
        private long vehicleInTime;

        public BookingBuilder setBookingId(String bookingId) {
            this.bookingId = UUID.randomUUID().toString();
            return this;
        }

        public BookingBuilder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public BookingBuilder setLevelNo(int levelNo) {
            this.levelNo = levelNo;
            return this;
        }

        public BookingBuilder setRowNo(int rowNo) {
            this.rowNo = rowNo;
            return this;
        }

        public BookingBuilder setSlotList(List<Slot> slotList) {
            this.slotList = slotList;
            return this;
        }

        public BookingBuilder setVehicleInTime(long vehicleInTime) {
            this.vehicleInTime = vehicleInTime;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }
}
