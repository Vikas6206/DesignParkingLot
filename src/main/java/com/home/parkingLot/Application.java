package com.home.parkingLot;

import java.awt.*;

public class Application {

    public static void main(String args[]) {
        ParkingLot parkingLot = getParkingLotData();
        Vehicle vehicle = getVehicleData();

        ParkingLotTemplate parkingLotTemplate = new ParkingLotBookingSystem(parkingLot);
        parkingLotTemplate.booking(vehicle);
        PaymentStatus paymentStatus = parkingLotTemplate.exit(vehicle);
        System.out.println("Payment done status -> "+paymentStatus.name());
    }

    private static Vehicle getVehicleData() {
        Vehicle vehicle = new Vehicle.VehicleBuilder(VehicleSize.TWOWHEELER, 9876).setColor(Color.black)
                .setModel("R15 V3").build();
        return vehicle;
    }

    private static ParkingLot getParkingLotData() {
        ParkingLot parkingLot = new ParkingLot();

        Slot slot = new Slot(0, 1);
        Row row = new Row(0, 1);

        Level level = new Level(1, parkingLot);
        level.getRowList().add(row);

        parkingLot.getLevelList().add(level);
        return parkingLot;
    }


}
