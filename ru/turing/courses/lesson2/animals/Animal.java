package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public abstract void makeSound();

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
