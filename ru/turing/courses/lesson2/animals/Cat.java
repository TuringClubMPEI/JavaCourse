package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {
    private String furType;

    public Cat(String name, int age, String color, String furType) {
        super(name, age, color);
        this.furType = furType;
    }

    public void meow() {
        System.out.println(getName() + " says meow.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping like a cat.");
    }
}
