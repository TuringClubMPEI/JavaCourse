package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {
    private String fur;
    private String breed;

    public Cat(String type, boolean eatingMeat, int age, boolean wild, String fur, String breed) {
        super(type, eatingMeat, age, wild);
        this.fur = fur;
        this.breed = breed;

    }

    @Override
    public void makeSound() {
        System.out.println("meow-meow");
    }
}
