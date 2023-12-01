package ru.turing.courses.lesson3.animal;

import ru.turing.courses.lesson2.animals.Animal;

import java.util.Objects;

public class Dog extends Animal {
    private boolean ownerMissing; // 1 or 0
    private boolean isAloneAtHome;
    private double hapiness;
    private String name;
    private int age;


    public void setOwnerMissing(boolean ownerMissing) {
        this.ownerMissing = ownerMissing;
    }

    public boolean isAloneAtHome() {
        return isAloneAtHome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return ownerMissing == dog.ownerMissing && isAloneAtHome == dog.isAloneAtHome && Double.compare(hapiness, dog.hapiness) == 0 && age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerMissing, isAloneAtHome, hapiness, name, age);
    }

    public double getHapiness() {
        return hapiness;
    }

    public Dog(double hapiness, String name, int age) {
        this.hapiness = hapiness;
        this.name = name;
        this.age = age;
    }

    public Dog(String type, int year, String color, double hapiness, String name, int age) {
        super(type, year, color);
        this.hapiness = hapiness;
        this.name = name;
        this.age = age;
    }

    public void setHapiness(double hapiness) {
        this.hapiness = hapiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {}

    public Dog(String name, int age) {this.name = name; this.age = age;}

    @Override
    public void sound() {
        System.out.println("Gav!Gav!Gav!");
    }

    public boolean isOwnerMissing() {
        return ownerMissing;
    }

    public void goForAWalk() {
        this.hapiness += 5.0;
    }

    public void setAloneAtHome(boolean aloneAtHome) {
        this.isAloneAtHome = aloneAtHome;
        if (aloneAtHome) {
            this.ownerMissing = true;
            this.hapiness -= 1.0;
        }

    }


}
