package com.TeoMax.Assignment1;

import com.TeoMax.Assignment1.employees.Developer;
import com.TeoMax.Assignment1.employees.Manager;
import com.TeoMax.Assignment1.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, "HR");
        Developer developer = new Developer("Bob", 102, 85000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());
        EmployeeUtilities.giveRaise(manager, 5000);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeInfo(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        EmployeeUtilities.giveRaise(developer, 3000);
    }
}