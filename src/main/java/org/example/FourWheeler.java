package org.example;

public class FourWheeler extends Vehicle {
    private Boolean manual;
    private Boolean airConditioned;

    public void start(String manual){
        if(this.manual){
            System.out.println("FourWheeler started in manual mode");
        }
        else{
            System.out.println("FourWheeler started in automatic mode");
        }
    }
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
        car.start("false");
        car.stop();
    }

}
