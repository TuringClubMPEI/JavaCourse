package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    protected String name;
    protected boolean isFlying;
    protected boolean isSwimming;
    protected int numberOfPaws;
    protected int age;

    public void makeSound() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public Animal(String name, boolean isFlying, boolean isSwimming, int numberOfPaws, int age) {
        this.name = name;
        this.isFlying = isFlying;
        this.isSwimming = isSwimming;
        this.numberOfPaws = numberOfPaws;
        this.age = age;
    }

    public Animal() {
    }
}

