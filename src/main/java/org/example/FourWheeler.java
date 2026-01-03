package org.example;

public class FourWheeler extends Vehicle {
    private Boolean manual;
    private Boolean airConditioned;

    public static void main(String[] args){
        FourWheeler car = new FourWheeler();
        car.setVehicleType("4x4");
        car.setFueltype("petrol");
        car.setSpeed("140km/hr");
        car.manual= false;
        car.airConditioned=true;
        System.out.println("FourWheeler Details:");
        System.out.println("Vehicle Type: "+ car.getVehicleType());
        System.out.println("Fuel Type: "+ car.getFueltype());
        System.out.println("Speed: "+ car.getSpeed());
        System.out.println("Manual: "+ car.manual);
        System.out.println("Air conditioned :"+ car.airConditioned);
        car.start();
        car.stop();
    }

}
