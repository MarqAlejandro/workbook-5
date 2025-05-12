package com.plurasight;

public class HoverCraft extends Vehicle{

    private int fanSize;

    public HoverCraft(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, int fanSize) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
        this.fanSize = fanSize;
    }

    public HoverCraft() {
        super();
        this.fanSize = 0;
    }

    public int getFanSize() {
        return fanSize;
    }

    public void setFanSize(int fanSize) {
        this.fanSize = fanSize;
    }
}
