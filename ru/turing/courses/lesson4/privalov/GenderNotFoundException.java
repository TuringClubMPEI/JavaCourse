package ru.turing.courses.lesson4.privalov;

public class GenderNotFoundException extends NullPointerException{
    public GenderNotFoundException() {
    }

    public GenderNotFoundException(String s) {
        super(s);
    }
}
