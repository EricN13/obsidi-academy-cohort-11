package com.bptn.course._06_Vehicle;

public class VehicleManager {

    public static void main(String[] args) {

        Car myCar = new Car("Honda", "Civic", 2023);

        myCar.displayBasicInfo();
        myCar.startEngine();
        myCar.drive();
        myCar.refuel(10);
        System.out.println(myCar.getFuelLevel());
        myCar.stopEngine();


        ElectricBike myBike =
                new ElectricBike("Trek", "E-Caliber", 2024);

        myBike.displayBasicInfo();
        myBike.startEngine();
        myBike.drive();
        myBike.charge(10);
        System.out.println(myBike.getBatteryLevel());
        myBike.stopEngine();


        // Polymorphism
        FuelConsuming fuelVehicle = myCar;

        fuelVehicle.refuel(5);
        System.out.println(fuelVehicle.getFuelLevel());


        ElectricPowered electricVehicle = myBike;

        electricVehicle.charge(5);
        System.out.println(electricVehicle.getBatteryLevel());
    }
}