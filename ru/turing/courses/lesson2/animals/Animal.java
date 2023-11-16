package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    //название
    protected String name;
    //является ли травоядным
    protected boolean isHerbivore;
    //вес
    protected double weight;

    //рацион
    public abstract void printFood();
    //продолжительность жизни
    public abstract void printLifeTime();
    //какие издает звуки
    public abstract void printMakeSound();

    public Animal(String name, boolean isHerbivore, double weight) {
        this.name = name;
        this.isHerbivore = isHerbivore;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
