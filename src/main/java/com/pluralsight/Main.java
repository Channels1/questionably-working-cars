package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface carUI = new UserInterface();
        carUI.display(new Scanner(System.in));
    }
}
