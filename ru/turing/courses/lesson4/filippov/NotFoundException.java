package ru.turing.courses.lesson4.filippov;

public class NotFoundException extends RuntimeException {
    String name=null;
    public NotFoundException(String name) {
        super(name);
        this.name = name;
    }
    public NotFoundException() {
        super();
    }
}

