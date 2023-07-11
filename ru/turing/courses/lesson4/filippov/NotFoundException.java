package ru.turing.courses.lesson4.filippov;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String name) {
        super(name);
    }
    public NotFoundException() {
        super();
    }
}

