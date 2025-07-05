package com.TeoMax.Assignment2;


import java.util.Scanner;

// Class Student with default constructor
class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

// Class Commission
class Commission {
    String name, address, phone;
    double salesAmount;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    public void calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + " is: " + commission);
    }
}

// Main class with main method
public class assignment2 {
    public static void main(String[] args) {
        Student student = new Student(); // Default constructor runs
        Commission employee = new Commission();
        employee.acceptDetails();
        employee.calculateCommission();
    }
}
