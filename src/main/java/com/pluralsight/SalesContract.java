package com.pluralsight;

public class SalesContract extends Contract{
    public SalesContract() {

    }

    public SalesContract(String date, String customerName, String customerEmail, int vehicleSold, double totalPrice, double monthlyPayment) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);


    }
}
