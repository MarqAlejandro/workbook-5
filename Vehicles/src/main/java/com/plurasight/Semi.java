package com.plurasight;

public class Semi extends Vehicle {

    private int numberOfTrailers;
    private boolean isSleeperCabin;

    public Semi(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, int numberOfTrailers, boolean isSleeperCabin) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
        this.numberOfTrailers = numberOfTrailers;
        this.isSleeperCabin = isSleeperCabin;
    }

    public Semi() {
        super();
        this.numberOfTrailers = 0;
        this.isSleeperCabin = false;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public boolean isSleeperCabin() {
        return isSleeperCabin;
    }

    public void setSleeperCabin(boolean sleeperCabin) {
        isSleeperCabin = sleeperCabin;
    }
}
