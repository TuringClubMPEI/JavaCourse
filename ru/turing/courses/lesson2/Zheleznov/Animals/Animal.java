package ru.turing.courses.lesson2.Zheleznov.Animals;

public abstract class Animal {
    private String name;
    private int length;
    private int legsCount;

    public abstract void soundAnimal();

    public abstract void stay();

    public Animal(String name, int length, int legsCount) {
        this.name = name;
        this.length = length;
        this.legsCount = legsCount;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
