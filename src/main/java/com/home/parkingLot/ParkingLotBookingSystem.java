package com.home.parkingLot;

import java.util.List;

public class ParkingLotBookingSystem extends ParkingLotTemplate {

    private ParkingLot parkingLot;

    protected ParkingLotBookingSystem(ParkingLot parkingLot) {
        super(parkingLot);
        this.parkingLot = parkingLot;
    }

    @Override
    protected Vehicle registerVehicle(Vehicle vehicle) {
        System.out.println("Vehicle " + vehicle.getNumberPlate() + " registered successfully");
        return vehicle;
    }

    @Override
    protected Row isParkingAvailable(VehicleSize vehicleSize, int noOfSlotNeeded) {
        System.out.println("Searching for space for " + vehicleSize.name() + " " + noOfSlotNeeded);
        return parkingLot.getLevelList().get(0).getRowList().get(0);
    }

    @Override
    protected Booking book(Vehicle vehicle, Row row) {
        Booking booking = new Booking.BookingBuilder()
                .setLevelNo(row.getLevelNo())
                .setRowNo(row.getRowNo())
                .setSlotList(row.getSlotList())
                .setVehicle(vehicle)
                .build();
        booking.getSlotList().forEach(slot -> slot.setOccupied(Boolean.TRUE));
        parkingLot.getBookingList().add(booking);
        return booking;
    }

    @Override
    protected Booking searchBooking(Vehicle vehicle) {
        //TODO:@vkumar: Probably need to override equals method in vehicle class
        /**
         Booking book=parkingLot.getBookingList()
         .stream()
         .filter(booking -> booking.getVehicle().equals(vehicle))
         .findFirst().get();
         **/
        System.out.println("Searching booking for vehicle " + vehicle.getNumberPlate());
        return parkingLot.getBookingList().get(0);
    }

    @Override
    protected Payment pay(Booking booking) {
        System.out.println("Payment for booking id :" + booking.getBookingId());
        Payment payment = new Payment(booking.getBookingId(), PaymentStatus.SUCCESS, PaymentMode.CARD);
        return payment;
    }

    @Override
    protected void clearSlot(List<Slot> slotList) {
        System.out.println("Clearing the slot from the parking ...");
        slotList.forEach(slot -> slot.setOccupied(Boolean.FALSE));
    }
}
