package com.plurasight;

public class Semi extends Vehicle {

    private int numberOfTrailers;
    private boolean isSleeperCabin;

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
