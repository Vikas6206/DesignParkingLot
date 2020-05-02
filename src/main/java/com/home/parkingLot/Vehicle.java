package com.home.parkingLot;

import java.awt.*;

public class Vehicle {
    private VehicleSize vehicleSize;
    private int numberPlate;
    private Color color;
    private String model;
    private int slotNeeded;

    public Vehicle(VehicleSize vehicleSize, int numberPlate, Color color, String model) {
        this.vehicleSize = vehicleSize;
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        if(this.vehicleSize ==VehicleSize.LARGE){
            this.slotNeeded=4;
        }else if(this.vehicleSize==VehicleSize.COMPACT){
            this.slotNeeded=2;
        }else{
            this.slotNeeded=1;
        }
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSlotNeeded() {
        return slotNeeded;
    }
}
