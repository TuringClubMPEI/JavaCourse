package ru.turing.courses.lesson2.animals;

public class cat extends Animal {
    private String fur;
    private String breed;

    public cat(String vid, boolean eatingmeat, int age, boolean wild, String fur, String breed) {
        super(vid, eatingmeat, age, wild);
        this.fur = fur;
        this.breed = breed;

    }
    @Override
    public void makeSound() {
        System.out.println("meow-meow");
    }
}
