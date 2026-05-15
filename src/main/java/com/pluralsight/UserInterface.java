package com.pluralsight;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    Scanner uKey = new Scanner(System.in);
    //Field
    private static Dealership dealership;

    private void init() {
        this.dealership = DealershipFileManager.getDealership();

    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        if(vehicles.isEmpty()) {
            System.out.println("No vehicles found");
        } else {
            for(Vehicle vehicle: vehicles) {
                System.out.println(vehicle);
            }
        }
    }


    //Constructor
    public UserInterface() {
        display(uKey);

    }
    //Displaying menu
    public void display(Scanner uKey) {
        init(); //Calling on the file
        while (true) {
            System.out.println("What are searching for specifically sucker");
            System.out.println("\t(1) Price");
            System.out.println("\t(2) Make/Model");
            System.out.println("\t(3) Year");
            System.out.println("\t(4) Color");
            System.out.println("\t(5) Mileage");
            System.out.println("\t(6) Vehicle type");
            System.out.println("\t(7) Show all Vehicles");
            System.out.println("\t(8) Add Vehicle");
            System.out.println("\t(9) Remove Vehicle");
            System.out.println("\t(0) Quit");
            System.out.print("Make your selection: ");
            int choice = uKey.nextInt();

            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehiclesTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest(uKey);
                    break;
                case 9:
                    processRemoveVehicleRequest(uKey);
                    break;
                case 0:
                    System.out.println("Come again real soon hehe");
                    uKey.close();
                    System.exit(0);

            }
        }



    }

    public static void processGetByPriceRequest() {

    }

    public static void processGetByMakeModelRequest() {

    }
    public static void processGetByYearRequest() {

    }

    public static void processGetByColorRequest() {

    }

    public static void processGetByMileageRequest() {

    }
    public static void processGetByVehiclesTypeRequest() {

    }
    // List all the vehicles in the dealership
    public void processGetAllVehiclesRequest() {
        ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>) dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    public static void processAddVehicleRequest(Scanner uKey) {
        System.out.print("Enter VIN number: ");
        int vin =uKey.nextInt();
        System.out.print("Enter year: ");
        int year = uKey.nextInt();
        System.out.print("Enter make: ");
        String make = uKey.next();
        System.out.print("Enter model: ");
        String model = uKey.next();
        System.out.print("Enter color: ");
        String color = uKey.next();
        System.out.print("Enter odometer: ");
        int odometer = uKey.nextInt();
        System.out.print("Enter Vehicle type: ");
        String vehicleType = uKey.next();
        System.out.print("Enter price: ");
        double price = uKey.nextDouble();



        Vehicle newVehicle = new Vehicle(vin,year,odometer,make,model,color,vehicleType,price);
        dealership.addVehicle(newVehicle);
        System.out.println("Vehicle added!");
    }
    public void processRemoveVehicleRequest(Scanner uKey) {
        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = uKey.nextInt();
        for(Vehicle vehicle : dealership.getAllVehicles()){
            if ( vehicle.getVin()== vin ) {
                dealership.removeVehicle(vehicle);
                System.out.println("Vehicle removed");
                return;
            }
        }
        System.out.println("Vehicle not found");
    }

}
