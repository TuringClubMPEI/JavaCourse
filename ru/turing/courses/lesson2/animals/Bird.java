package ru.turing.courses.lesson2.animals;

public class Bird extends Animal{
    private int speed;
    private String size; // маленький, средний крупный

    public Bird(int speed, String size) {
        this.speed = speed;
        this.size = size;
    }

    public Bird(int weight, String colour, int lifespan, int numberOfLimbs, int speed, String size) {
        super(weight, colour, lifespan, numberOfLimbs);
        this.speed = speed;
        this.size = size;
    }

    public Bird() {
    }

    @Override
    public void makeSound() {
        System.out.println("чик-чирик");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
