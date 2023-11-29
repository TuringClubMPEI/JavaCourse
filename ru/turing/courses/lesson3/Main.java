package ru.turing.courses.lesson3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Registry<Animal> registry = new Registry<>();

        Capybara capybara = new Capybara("Richard", "brown");
        Frog frog = new Frog("Oleg", "green");

        registry.add(1, capybara);
        registry.add(2, frog);

        System.out.println(registry.getByName("Richard"));

    }
}
