package com.animals;

public class dog extends animal {
    @Override 
    public void sound() {
        super.sound();
        System.out.println("Dog Barks");
    }
    
}
