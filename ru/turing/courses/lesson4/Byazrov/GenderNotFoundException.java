package ru.turing.courses.lesson4.Byazrov;

public class GenderNotFoundException extends RuntimeException{
    public GenderNotFoundException() {
    }

    public GenderNotFoundException(String message) {
        super(message);
    }

    public GenderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenderNotFoundException(Throwable cause) {
        super(cause);
    }
}
