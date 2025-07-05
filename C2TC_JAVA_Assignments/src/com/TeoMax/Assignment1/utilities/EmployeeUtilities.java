package com.TeoMax.Assignment1.utilities;

import com.TeoMax.Assignment1.employees.Employee;

/**
 * Utility class to perform operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Displays basic employee info.
     * @param employee The employee object.
     */
    public static void printEmployeeInfo(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: ₹" + employee.getSalary());
    }

    /**
     * Gives a raise to the employee.
     * @param employee The employee object.
     * @param amount Amount to increase the salary by.
     */
    public static void giveRaise(Employee employee, double amount) {
        double newSalary = employee.getSalary() + amount;
        // Accessing protected setter
        employee.setSalary(newSalary);
        System.out.println("Salary updated to: ₹" + employee.getSalary());
    }
}