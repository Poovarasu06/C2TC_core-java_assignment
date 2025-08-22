package assignment4;

import java.util.Scanner;

/**
 * Main class for polymorphism assignment - billing system with overloading.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details in CSV format
        String bookingDetails = sc.nextLine();
        String[] parts = bookingDetails.split(",");
        TicketBooking booking = new TicketBooking(parts[0], parts[1], Integer.parseInt(parts[2]));

        // Read payment choice
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.displayBooking();

        switch (choice) {
            case 1:
                double amountCash = sc.nextDouble();
                booking.makePayment(amountCash);
                break;
            case 2:
                double amountWallet = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(amountWallet, walletNumber);
                break;
            case 3:
                String holderName = sc.nextLine();
                double amountCard = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amountCard, cardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
