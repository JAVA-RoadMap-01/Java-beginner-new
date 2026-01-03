package org.example;

import java.util.Scanner;

public class TwoWheeler extends Vehicle 
{
    private Boolean gears;
    
    
    public TwoWheeler() {
        
    }
    
    public static void main(String[] args)
    {
        TwoWheeler obj = new TwoWheeler();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle type (bike/scooter): ");
        String type = scanner.nextLine();
        obj.setVehicleType(type);
        if( obj.getVehicleType().equals("bike")){
            TwoWheeler bike = new TwoWheeler();
            bike.setSpeed("100km/hr");
            bike.setFueltype("Petrol");
            bike.gears = true;
            System.out.println("Bike Details:");
            System.out.println("Speed: " + bike.getSpeed());
            System.out.println("Fuel Type: " + bike.getFueltype());
            System.out.println("Gears: " + bike.gears);
            bike.start();
            bike.stop();
        }
        else if( obj.getVehicleType().equals("scooter")){
            TwoWheeler scooter = new TwoWheeler();
            scooter.setSpeed("80km/hr");
            scooter.setFueltype("Diesel");
            scooter.gears = false;
            System.out.println("Scooter Details:");
            System.out.println("Speed: " + scooter.getSpeed());
            System.out.println("Fuel Type: " + scooter.getFueltype());
            System.out.println("Gears: " + scooter.gears);
            scooter.start();
            scooter.stop();
        }
        else{
            System.out.println("Invalid Vehicle Type");
        }
    scanner.close();
    }
    
}
