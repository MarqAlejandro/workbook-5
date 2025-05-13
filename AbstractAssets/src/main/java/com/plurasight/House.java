package com.plurasight;

public class House extends AbstractAsset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        if(condition == 1){
            return originalCost + (180.00 * squareFoot) + (lotSize * .25);
        }
        else if(condition == 2){
            return originalCost + (130.00 * squareFoot) + (lotSize * .25);
        }
        else if(condition == 3){
            return originalCost + (90.00 * squareFoot) + (lotSize * .25);
        }
        else{
            return originalCost + (80.00 * squareFoot) + (lotSize * .25);
        }
    }
}
