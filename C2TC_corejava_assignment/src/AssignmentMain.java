import assignment.employees.Manager;
import assignment.employees.Developer;
import assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate Employee, Manager, Developer, and utilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("siva", 101, 75000, "IT");
        Developer dev = new Developer("poovarasu", 102, 60000, "Java");

        System.out.println("=== Before Salary Hike ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== After Salary Hike ===");
        EmployeeUtilities.giveSalaryHike(mgr, 10);
        EmployeeUtilities.giveSalaryHike(dev, 15);

        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);
    }
}
