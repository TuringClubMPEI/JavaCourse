package ru.turing.courses.lesson4;

public class GenderNotFoundException extends IllegalStateException {
    public GenderNotFoundException (String s) {
        super(s);
    }
    public GenderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public GenderNotFoundException(Throwable cause) {
        super(cause);
    }
}
