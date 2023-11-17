package ru.turing.courses.lesson2.animals;

public abstract class Animal {
public int amountOfSleep;
public void sleep(){
    System.out.println("Zzzz");
}
public abstract void eat();

    public int getAmountOfSleep() {
        return amountOfSleep;
    }

    public abstract int amountOfLegs();
}
