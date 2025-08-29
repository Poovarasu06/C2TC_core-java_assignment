package assignment6;
/**
 * Main class to demonstrate the banking system with exception handling.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 5000);

        // Display initial balance
        account.displayBalance();

        // Deposit demonstration
        try {
            account.deposit(2000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Withdrawal demonstration
        try {
            account.withdraw(8000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Valid withdrawal
        try {
            account.withdraw(3000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
