package ru.turing.courses.lesson2.byazrov;

import java.util.Objects;

public class Cat extends Animal {

    private int numberOfLives; //remaining out of 9
    private boolean canUseToilet;

    public Cat(String name, int age, int remainingNumberOfLives, boolean doesKnowHowToUseToilet) {
        super(name, age);
        this.numberOfLives = remainingNumberOfLives;
        this.canUseToilet = doesKnowHowToUseToilet;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("meow-meow");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Cat doesn't really wanna go for a walk, because it's a cat.");
    }

    public void jumpOnATable() {
        System.out.println("Cat jumped on your desk");
    }

    public int getRemainingNumberOfLives() {
        return numberOfLives;
    }

    public void setRemainingNumberOfLives(int remainingNumberOfLives) {
        this.numberOfLives = remainingNumberOfLives;
    }

    public boolean isDoesKnowHowToUseToilet() {
        return canUseToilet;
    }

    public void setDoesKnowHowToUseToilet(boolean doesKnowHowToUseToilet) {
        this.canUseToilet = doesKnowHowToUseToilet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return numberOfLives == cat.numberOfLives && canUseToilet == cat.canUseToilet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLives, canUseToilet);
    }
}
