package ru.turing.courses.lesson4;

public class GenderNotFoundException extends RuntimeException {
    public GenderNotFoundException(String message) {
        super(message);
    }
}
