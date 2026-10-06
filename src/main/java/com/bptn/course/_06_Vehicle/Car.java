package com.bptn.course._06_Vehicle;


public class Car extends Vehicle implements FuelConsuming {
    double fuelLevel=50.0;
    public Car(String make,String model,int year){
        super(make,model,year );
    }
    @Override
    public void startEngine(){
        isEngineOn=true;
        System.out.println("car engine started");

    }
    @Override
    public void stopEngine(){
        isEngineOn=false;
        System.out.println("car engine stopped");

    }
    @Override
    public void drive(){
        System.out.println("car is driving");

    }
    @Override
    public void refuel(double liters){
        fuelLevel=fuelLevel+liters;
        System.out.println("car refueled");

    }
    public double getFuelLevel(){
        return fuelLevel;
    }


}

