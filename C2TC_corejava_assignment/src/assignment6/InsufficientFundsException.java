package assignment6;

/**
 * Custom exception to handle insufficient funds during withdrawal.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
