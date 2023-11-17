package ru.turing.courses.lesson2.animals;

public class Sparrow extends Animal{
    {
        amountOfSleep=10;
    }
    @Override
    public void eat() {
        System.out.println("кушает семечки");
    }

    @Override
    public int amountOfLegs() {
        return 2;
    }
}
