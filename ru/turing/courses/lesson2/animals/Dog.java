package ru.turing.courses.lesson2.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating like a dog.");
    }
}
