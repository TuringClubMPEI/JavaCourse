package ru.turing.courses.lesson2.animals;

public class Main {
    public static void main(String[] args) {
        Capibara boris = new Capibara("Boris", 25.5d, false, true, true);
        Cat oleg = new Cat("Oleg", 10d, false, true, false);

        boris.makeSound();
        oleg.makeSound();
    }
}
