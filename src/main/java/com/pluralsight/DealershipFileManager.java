package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {
    public static Dealership getDealership() {
        Dealership dealership = new Dealership("Questionably working and existing cars","2888 not scamming road","666-777-6767");

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
            String carData;
            br.readLine();

            while ((carData = br.readLine())!= null) {
                String[] splitCarData = carData.split(Pattern.quote("|"));
                if(carData.trim().isEmpty()) continue;

                int vin = Integer.parseInt(splitCarData[0]);
                int year = Integer.parseInt(splitCarData[1]);
                String make = splitCarData[2];
                String model = splitCarData[3];
                String vehicleType = splitCarData[4];
                String color = splitCarData[5];
                int odometer = Integer.parseInt(splitCarData[6]);
                double price = Double.parseDouble(splitCarData[7]);

                Vehicle vehicle = new Vehicle(vin, year,odometer,make,model,color,vehicleType,price);
                dealership.addVehicle(vehicle);
            }


        } catch (IOException e) {
            System.out.println("File not found");
        }

        return dealership;
    }

    public static void saveDealership(Dealership dealership){

    }
}