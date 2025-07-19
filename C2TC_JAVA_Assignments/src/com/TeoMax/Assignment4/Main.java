package com.TeoMax.Assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice of Airline:");
        System.out.println("1 for AirIndia");
        System.out.println("2 for KingFisher");
        System.out.println("3 for Indigo");
        System.out.print("Choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.print("Enter number of hours: ");
        int hours = Integer.parseInt(sc.nextLine());

        System.out.print("Enter cost per hour: ");
        double costPerHour = Double.parseDouble(sc.nextLine());

        Airfare flight = null;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                sc.close();
                return;
        }

        double totalAmount = flight.calculateAmount();
        System.out.printf("Total Fare: %.2f\n", totalAmount);

        sc.close();
    }
}
