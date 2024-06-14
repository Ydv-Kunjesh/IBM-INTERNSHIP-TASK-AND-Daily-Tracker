package com.Vehicles;

public class car extends Vehicle {
    int noOfDoors;

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("No. of Doors: " + noOfDoors);
    }
    public car(String make, String model , int noOfDoors) {
        super(make, model);
        this.noOfDoors = noOfDoors;
    }
}