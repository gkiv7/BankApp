package gr.aueb.cf.exceptions;

public class InsufficientBalanceException extends Exception{
    private static final long serialVersionUnID = 1L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for amount " + amount);
    }
}
