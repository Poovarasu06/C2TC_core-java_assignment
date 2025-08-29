package assignment6;
/**
 * The BankAccount class simulates a simple bank account.
 * It supports deposit, withdrawal, and balance display operations.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;

    /**
     * Parameterized constructor to initialize account.
     */
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposits money into the account.
     * @param amount The amount to deposit.
     * @throws InvalidAmountException if amount is less than or equal to 0.
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    /**
     * Withdraws money from the account.
     * @param amount The amount to withdraw.
     * @throws InvalidAmountException if amount is less than or equal to 0.
     * @throws InsufficientFundsException if balance is less than the withdrawal amount.
     */
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    /**
     * Displays the current balance.
     */
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
