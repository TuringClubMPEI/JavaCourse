package ru.turing.courses.lesson2.animals;

public class Wolf extends Animal {
    {
        amountOfSleep = 8;
    }

    @Override
    public void eat() {
        System.out.println("кушает мясо");
    }

    @Override
    public int amountOfLegs() {
        return 4;
    }
}
