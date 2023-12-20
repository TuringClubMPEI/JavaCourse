package ru.turing.courses.lesson4;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }

    public GenderException () {}

    @Override
    public String getMessage() {
        return "Такого пола не существует!";
    }
}
