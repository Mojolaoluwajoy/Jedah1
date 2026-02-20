package chapter11.exercises.customEception;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
