package ru.turing.courses.lesson2.animals;

public class Birds extends Animal{
    private int speed;
    private String size; // маленький, средний крупный

    public Birds(int speed, String size) {
        this.speed = speed;
        this.size = size;
    }

    public Birds() {
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
