package ru.turing.courses.lesson3.VersionA;

import java.util.Objects;

public class Stork extends Animal{
    //размах крыльев
    private int wingspan;
    //длина клюва
    private int lengthBeak;

    public Stork(String name, boolean isHerbivore, double weight, int wingspan, int lengthBeak) {
        super(name, isHerbivore, weight);
        this.wingspan = wingspan;
        this.lengthBeak = lengthBeak;
    }

    @Override
    public void printFood() {
        System.out.println("лягушки, мелкие млекопитающие, мелкие птицы");
    }

    @Override
    public void printLifeTime() {
        System.out.println("примерно 20-21 год");
    }

    @Override
    public void printMakeSound() {
        System.out.println("хлопают");
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getLengthBeak() {
        return lengthBeak;
    }

    public void setLengthBeak(int lengthBeak) {
        this.lengthBeak = lengthBeak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stork stork = (Stork) o;
        return wingspan == stork.wingspan && lengthBeak == stork.lengthBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingspan, lengthBeak);
    }

    @Override
    public void call(Guest guest) {
        guest.attend(this);
    }
}
