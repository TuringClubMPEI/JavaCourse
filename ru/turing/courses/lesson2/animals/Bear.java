package ru.turing.courses.lesson2.animals;

public class Bear extends Animal {
    private double hunger;
    private boolean isItWinter; //1 - да

    public double getHunger() {
        return hunger;
    }

    public boolean isItWinter() {
        return isItWinter;
    }

    public void goSleep(boolean isItWinter) {
        if (isItWinter)
            System.out.println("Zzzzzz");
    }

    public void eatBerries(double hunger) {
        this.hunger += 10.0;
    }
}
