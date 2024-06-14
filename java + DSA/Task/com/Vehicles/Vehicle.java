package com.Vehicles;


public class Vehicle {
    String  make;
    String model;

    public void displayDetail() {
        System.out.println("Make: " + make + "\nModel: " + model);
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;



    }
}