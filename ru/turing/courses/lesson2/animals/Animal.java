package ru.turing.courses.lesson2.animals;

public abstract class Animal {

    protected String type;
    protected boolean eatingMeat;
    // true - eating other animals , false - not
    protected int age;
    protected boolean wild;

    // true - wild animal, false - ok to live with humans
    public abstract void makeSound();

    public Animal(String type, boolean eatingMeat, int age, boolean wild) {
        this.type = type;
        this.eatingMeat = eatingMeat;
        this.age = age;
        this.wild = wild;

    }

    // method defines is animal dangerous for human;
    public boolean isDangerous() {
        return eatingMeat & wild;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public int getAge() {
        return age;
    }

    public boolean isWild() {
        return wild;
    }

    public void setVid(String vid) {
        this.type = type;
    }

    public void setEatingmeat(boolean eatingmeat) {
        this.eatingMeat = eatingmeat;
    }

    public String getVid() {
        return type;
    }

    public boolean isEatingmeat() {
        return eatingMeat;
    }

}