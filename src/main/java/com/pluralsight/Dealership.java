package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name,address,phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<Vehicle>();
    }
    //Search function getters
    public List<Vehicle> getVehiclesByPrice(int min, int max) {
        return null;
    }
    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        return null;
    }
    public List<Vehicle> getVehicleByYear(int min, int max) {
        return null;
    }
    public List<Vehicle> getVehicleByColor(String color) {
        return null;
    }
    public List<Vehicle> getVehicleByMileage(String VehicleType) {
        return null;
    }
    public List<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {

        this.inventory.remove(vehicle);
    }


    //Getters for main constructor
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
