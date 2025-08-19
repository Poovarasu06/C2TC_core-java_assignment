package assignment.utilities;

import assignment.employees.Employee;

/**
 * EmployeeUtilities provides helper methods for employee-related operations.
 */
public class EmployeeUtilities {

    public static void giveSalaryHike(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " got a salary hike. New Salary: " + newSalary);
    }

    public static void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}
