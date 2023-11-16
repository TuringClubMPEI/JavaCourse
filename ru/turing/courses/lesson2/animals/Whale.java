package ru.turing.courses.lesson2.animals;

public class Whale extends Animal {

    protected boolean wasOnWhaling;

    @Override
    public void makeSound() {
        System.out.println("*звуки голодного кита*");
    }

    @Override
    public void eat() {
        System.out.println("Кит съел деда");
    }

    public void blubber() {
        System.out.println("whale goes brrr");
    }

    public boolean isWasOnWhaling() {
        return wasOnWhaling;
    }

    public void setWasOnWhaling(boolean wasOnWhaling) {
        this.wasOnWhaling = wasOnWhaling;
    }

    public Whale(int age, String color, boolean wasOnWhaling) {
        super(age, color);
    }
}
