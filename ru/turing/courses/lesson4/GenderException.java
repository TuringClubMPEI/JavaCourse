package ru.turing.courses.lesson4;

public class GenderException extends Exception {
    private String message;
    public GenderException(String message) {
        super(message);
        this.message = message;
    }

    public GenderException () {}

    @Override
    public String getMessage() {
        return message;
    }
}
