package ru.turing.courses.lesson2.byazrov;

import java.util.Objects;

public class Cat extends Animal {

    private int remainingNumberOfLives;
    private boolean doesKnowHowToUseToilet;

    public Cat(String name, int age, int remainingNumberOfLives, boolean doesKnowHowToUseToilet) {
        super(name, age);
        this.remainingNumberOfLives = remainingNumberOfLives;
        this.doesKnowHowToUseToilet = doesKnowHowToUseToilet;
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
        return remainingNumberOfLives;
    }

    public void setRemainingNumberOfLives(int remainingNumberOfLives) {
        this.remainingNumberOfLives = remainingNumberOfLives;
    }

    public boolean isDoesKnowHowToUseToilet() {
        return doesKnowHowToUseToilet;
    }

    public void setDoesKnowHowToUseToilet(boolean doesKnowHowToUseToilet) {
        this.doesKnowHowToUseToilet = doesKnowHowToUseToilet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return remainingNumberOfLives == cat.remainingNumberOfLives && doesKnowHowToUseToilet == cat.doesKnowHowToUseToilet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(remainingNumberOfLives, doesKnowHowToUseToilet);
    }
}
