package com.home.parkingLot;

import java.awt.*;

public class Vehicle {
    private VehicleSize vehicleSize;
    private int numberPlate;
    private Color color;
    private String model;
    private int slotNeeded;

    public Vehicle(VehicleBuilder vehicleBuilder) {
        this.vehicleSize = vehicleBuilder.vehicleSize;
        this.numberPlate = vehicleBuilder.numberPlate;
        this.color = vehicleBuilder.color;
        this.model = vehicleBuilder.model;
        this.slotNeeded=vehicleBuilder.slotNeeded;
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

    public static class VehicleBuilder {


        private VehicleSize vehicleSize;
        private int numberPlate;

        private Color color;
        private String model;
        private int slotNeeded;

        public VehicleBuilder(VehicleSize vehicleSize, int numberPlate) {
            this.vehicleSize = vehicleSize;
            this.numberPlate = numberPlate;

            if (vehicleSize == VehicleSize.LARGE) {
                slotNeeded = 4;
            } else if (vehicleSize == VehicleSize.COMPACT) {
                slotNeeded = 2;
            } else {
                slotNeeded = 1;
            }
        }

        public VehicleBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public VehicleBuilder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }

    }

}
