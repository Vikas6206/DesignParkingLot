package com.home.parkingLot;

import java.util.List;

public abstract class ParkingLotTemplate {
    protected ParkingLot parkingLot;

    protected ParkingLotTemplate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    protected abstract Vehicle registerVehicle(Vehicle vehicle);

    protected abstract Row isParkingAvailable(VehicleSize vehicleSize, int noOfSlotNeeded);

    protected abstract Booking book(Vehicle vehicle, Row row);

    protected abstract Booking searchBooking(Vehicle vehicle);

    protected abstract Payment pay(Booking booking);

    protected abstract void clearSlot(List<Slot> slotList);

    public IBooking booking(Vehicle vehicle) {
        vehicle = registerVehicle(vehicle);
        Row row = isParkingAvailable(vehicle.getVehicleSize(), vehicle.getSlotNeeded());

        if (row == null) {
            System.out.println("Parking not available!");
            return new EmptyBooking();
        }

        Booking booking = book(vehicle, row);
        return booking;

    }

    public PaymentStatus exit(Vehicle vehicle) {
        IBooking booking = searchBooking(vehicle);
        if(booking instanceof EmptyBooking){
            System.out.println("Rogue vehicle found ...");
            return PaymentStatus.FAIL;
        }
        Payment payment = pay((Booking) booking);
        Booking book = (Booking) booking;
        clearSlot(book.getSlotList());
        return payment.getPaymentStatus();
    }

}
