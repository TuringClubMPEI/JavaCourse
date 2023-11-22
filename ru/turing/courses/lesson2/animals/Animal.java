package ru.turing.courses.lesson2.animals;

public abstract class Animal {

    protected String type;
    protected boolean eatingmeat;
    // true - eating other animals , false - not
    protected int age;
    protected boolean wild;

    // true - wild animal, false - ok to live with humans
    public abstract void makeSound();

    public Animal(String vid, boolean eatingmeat, int age, boolean wild) {
        this.vid = vid;
        this.eatingmeat = eatingmeat;
        this.age = age;
        this.wild = wild;

    }

    // method defines is animal dangerous for human;
    public boolean isDangerous() {
        return eatingmeat & wild;
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
        this.vid = vid;
    }

    public void setEatingmeat(boolean eatingmeat) {
        this.eatingmeat = eatingmeat;
    }

    public String getVid() {
        return vid;
    }

    public boolean isEatingmeat() {
        return eatingmeat;
    }

}