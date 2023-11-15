package ru.turing.courses.lesson2.animals;

public class Animal {
    private int weight;
    private String colour;
    private int lifespan; // продолжительность жизни
    private int number_of_limbs; // кол-во конечностей

    public Animal(int weight, String colour, int lifespan, int number_of_limbs) {
        this.weight = weight;
        this.colour = colour;
        this.lifespan = lifespan;
        this.number_of_limbs = number_of_limbs;
    }

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

    public int getNumber_of_limbs() {
        return number_of_limbs;
    }

    public void setNumber_of_limbs(int number_of_limbs) {
        this.number_of_limbs = number_of_limbs;
    }
}

