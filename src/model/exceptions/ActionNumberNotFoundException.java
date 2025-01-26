package model.exceptions;

public class ActionNumberNotFoundException extends RuntimeException {
    public ActionNumberNotFoundException(String message) {
        super(message);
    }
}
