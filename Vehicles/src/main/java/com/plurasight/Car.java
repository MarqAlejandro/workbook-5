package com.plurasight;

public class Car extends Vehicle{

    private int safetyRating;
    private int numberOfDoors;
    private String carType;

    public Car(String typeOfVehicle, String make, String model, int passengerCount, int travelRange, int year, String VIN, int odometer, boolean isElectric, String color, int cargoCapacity, int fuelCapacity, int safetyRating, int numberOfDoors, String carType) {
        super(typeOfVehicle, make, model, passengerCount, travelRange, year, VIN, odometer, isElectric, color, cargoCapacity, fuelCapacity);
        this.safetyRating = safetyRating;
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
    }

    public Car() {
        super();
        this.safetyRating = 0;
        this.numberOfDoors = 0;
        this.carType = "";
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
