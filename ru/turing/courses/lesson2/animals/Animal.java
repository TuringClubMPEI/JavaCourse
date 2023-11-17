package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    private String name;
    private double weight;
    private boolean flying;
    private boolean swimming;

    public Animal(String name, double weight, boolean flying, boolean swimming) {
        this.name = name;
        this.weight = weight;
        this.flying = flying;
        this.swimming = swimming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public boolean isSwimming() {
        return swimming;
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }

    public abstract void makeSound();
}

