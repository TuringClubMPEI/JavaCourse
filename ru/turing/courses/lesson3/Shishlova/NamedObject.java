package ru.turing.courses.lesson3.Shishlova;

public abstract class NamedObject {
    private String name;

    public NamedObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}