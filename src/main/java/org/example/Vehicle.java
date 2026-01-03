package org.example;

public class Vehicle {
    
    private String speed;
    private String fueltype;
    private String vehicleType;
    public String getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public String getFueltype() {
        return fueltype;
    }
    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
    
    
    public void start(){
        System.out.println("Vehicle started");
    }
    public void stop(){
        System.out.println("Vehicle stopped");
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

}
