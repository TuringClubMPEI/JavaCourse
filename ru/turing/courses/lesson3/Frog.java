package ru.turing.courses.lesson3;

import java.util.Objects;

public class Frog extends Animal{

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
