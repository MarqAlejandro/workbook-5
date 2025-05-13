package com.plurasight;

public class Vehicle extends Asset {
    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        if((year >= 0) && (year <= 3)) {
            if (((!makeModel.contains("Honda")) || (!makeModel.contains("Toyota"))) && (odometer > 100_000)) {
                return (originalCost - (originalCost * 0.03)) - (originalCost * 0.25);
            } else {
                return originalCost - (originalCost * 0.03);
            }
        }
        else if((year >= 4) && (year <= 6)) {
            if (((!makeModel.contains("Honda")) || (!makeModel.contains("Toyota"))) && (odometer > 100_000)) {
                return (originalCost - (originalCost * 0.06)) - (originalCost * 0.25);
            } else {
                return originalCost - (originalCost * 0.06);
            }
        }
        else if((year >= 7) && (year <= 10)) {
            if (((!makeModel.contains("Honda")) || (!makeModel.contains("Toyota"))) && (odometer > 100_000)) {
                return (originalCost - (originalCost * 0.08)) - (originalCost * 0.25);
            } else {
                return originalCost - (originalCost * 0.08);
            }
        }
        else{
            if (((!makeModel.contains("Honda")) || (!makeModel.contains("Toyota"))) && (odometer > 100_000)) {
                return (originalCost - 1000.00) - (originalCost * 0.25);
            } else {
                return originalCost - 1000.00;
            }
        }


    }
}
