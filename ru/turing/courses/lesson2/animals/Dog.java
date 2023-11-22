package ru.turing.courses.lesson2.animals;

public class Dog extends Animal {
    private boolean stick;
    private String breed;

    public Dog(String name, int legs, String sex, int age, boolean stick, String breed) {
        super(name, legs, sex, age);
        this.stick = stick;
        this.breed = breed;
    }

    public void giveLeg() {
        System.out.println("собака протянула лапу");
    }

    @Override
    public void run() {
        System.out.println("собака бежит");
    }

    @Override
    public void makeSound() {
        System.out.println("гав");
    }

    public void stickOf(boolean stick) {
        if (stick) {
            System.out.println("отдай");
        } else System.out.println("брось палку");
    }

    public boolean isStick() {
        return stick;
    }

    public void setStick(boolean stick) {
        this.stick = stick;
    }
}
