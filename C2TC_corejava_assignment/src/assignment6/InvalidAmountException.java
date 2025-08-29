package assignment6;
/**
 * Custom exception to handle invalid deposit or withdrawal amounts.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
