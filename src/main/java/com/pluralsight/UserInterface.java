package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner uKey = new Scanner(System.in);
    //Field
    private Dealership dealership;

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
                processAddVehicleRequest();
                break;
            case 9:
                processRemoveVehicleRequest();
                break;
            case 0:
                System.out.println("Come again real soon hehe");
                uKey.close();
                System.exit(0);

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
    public static void processGetAllVehiclesRequest() {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    public static void processAddVehicleRequest() {

    }
    public static void processRemoveVehicleRequest() {

    }
}
