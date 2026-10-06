package com.bptn.course._06_Vehicle;


public class ElectricBike extends Vehicle implements ElectricPowered {

    double batteryLevel = 75.0;

    public ElectricBike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Electric bike started.");
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Electric bike stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Electric bike is moving.");
    }

    @Override
    public void charge(double kWh) {
        batteryLevel += kWh;
        System.out.println("Electric bike charged.");
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }
}

