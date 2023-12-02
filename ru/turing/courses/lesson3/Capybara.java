package ru.turing.courses.lesson3;

import java.util.Objects;

public class Capybara extends Animal{

    public Capybara(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "Capybara{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
