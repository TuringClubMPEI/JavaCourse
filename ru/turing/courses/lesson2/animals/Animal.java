package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    // статические поля
    protected static int hungerRate;

    // динамические поля
    protected int age;
    protected int hunger;
    protected String name;

    public void Animal(int age, int hunger, String name) {
        if(name ==null)
            return;
        this.age = age;
        this.hunger = hunger;
        this.name = name;
    }

    public void Eat(int nutrition) {
        hunger -= nutrition;
    }

    protected void GetHungry(int time) {
        hunger += time * hungerRate;
    }

    public abstract void Age(int time);
  
}

