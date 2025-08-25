package assignmentfive;

import java.util.Scanner;

/**
 * Main class to test Airfare implementations.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                flight.display();
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                flight.display();
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                flight.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
