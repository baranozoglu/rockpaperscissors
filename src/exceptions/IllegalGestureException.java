package exceptions;

public class IllegalGestureException extends IllegalStateException {
    public IllegalGestureException(String input) {
        super(String.format("Unsupported type %s. Please choose an option from menu!", input));
    }
}
