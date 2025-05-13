package com.plurasight;

public class Cash extends AbstractAsset{


    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return originalCost;
    }
}
