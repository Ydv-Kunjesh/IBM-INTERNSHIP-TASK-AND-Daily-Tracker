package com.Vehicles;

public class truck extends Vehicle {
    int payLoadCapacity;

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("PayLoad Capacity: " + payLoadCapacity);
    }
    public truck(String make, String model , int payLoadCapacity) {
        super(make, model);
        this.payLoadCapacity = payLoadCapacity;
    }
}