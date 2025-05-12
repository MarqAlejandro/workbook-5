package com.plurasight;

public class Moped extends Vehicle{
    private String size;

    public Moped(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, String size) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
        this.size = size;
    }

    public Moped() {
        super();
        this.size = "";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
