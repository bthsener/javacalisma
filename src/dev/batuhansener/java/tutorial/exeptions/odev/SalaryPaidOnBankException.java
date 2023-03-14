package dev.batuhansener.java.tutorial.exeptions.odev;

public class SalaryPaidOnBankException extends Exception{

    String message;
    Exception cause;

    public SalaryPaidOnBankException() {
    }

    public SalaryPaidOnBankException(String message){
        super(message);
    }

    public SalaryPaidOnBankException(Throwable cause) {
        super(cause);
    }

    public SalaryPaidOnBankException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalaryPaidOnBankException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
