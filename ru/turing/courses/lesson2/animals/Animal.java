package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    private int weight;
    private String colour;
    private int lifespan; // продолжительность жизни
    private int numberOfLimbs; // кол-во конечностей

    public Animal(int weight, String colour, int lifespan, int numberOfLimbs) {
        this.weight = weight;
        this.colour = colour;
        this.lifespan = lifespan;
        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract void makeSound();

    public Animal() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }
}

