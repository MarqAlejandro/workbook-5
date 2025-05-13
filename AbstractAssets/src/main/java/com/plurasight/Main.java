package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        List<AbstractAsset> assetList = new ArrayList<>();

        House myHouse = new House("my house","01/01/2025" ,1000.00,"123 A street", 1, 100,150);
        assetList.add(myHouse);

        House vacationHouse = new House("2nd house", "02/02/2025",2000.00,"456 B Street",1, 200, 250);
        assetList.add(vacationHouse);

        Vehicle myCar = new Vehicle("my car", "03/03/2025", 3000.00, "Honda", 1, 100_000);
        assetList.add(myCar);

        Vehicle myTruck = new Vehicle("my Truck","04/04/2025",4000.00, "Ford",5,120_000);
        assetList.add(myTruck);

        Cash cash = new Cash("Mattress Money","05/05/2025",50.0);
        assetList.add(cash);

        for (AbstractAsset asset : assetList){
            if(asset instanceof House){
                System.out.println("House");

                System.out.println(asset.getDescription() + " " + asset.getDateAcquired() + " " + asset.getValue() + " " + ((House) asset).getAddress());
            }

            if(asset instanceof Vehicle){
                System.out.println("Vehicle");
                System.out.println(asset.getDescription() + " " + asset.getDateAcquired() + " " + asset.getValue() + " " + ((Vehicle) asset).getYear() + " " + ((Vehicle) asset).getMakeModel());
            }

            if(asset instanceof Cash){
                System.out.println("Cash");
                System.out.println(asset.getDescription() + " " + asset.getDateAcquired() + " " + asset.getValue());
            }

        }


    }
}