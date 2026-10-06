package com.bptn.course._06_Vehicle;

public abstract class Vehicle {
    String make;
    String model;
    int year;
    boolean isEngineOn=false;
    Vehicle(String make,String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void displayBasicInfo(){
        System.out.println("make:" +this.make );
        System.out.println("model:"+this.model );
        System.out.println("year:" +this.year );
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();


}


