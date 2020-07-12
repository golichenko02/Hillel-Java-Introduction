package exceptions;

public class IllegalAmountWithdrawException extends RuntimeException {
    public IllegalAmountWithdrawException(String message) {
        super(message);
    }
}
