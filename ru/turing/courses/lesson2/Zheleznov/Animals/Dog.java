package ru.turing.courses.lesson2.Zheleznov.Animals;

import java.util.Objects;

public class Dog extends Animal {
    private final boolean haveStick;

    public Dog(String name, int length, int legsCount, boolean haveStick) {
        super(name, length, legsCount);
        this.haveStick = haveStick;
    }

    @Override
    public void soundAnimal() {
        System.out.println(getName() + " сказал гав");
    }

    @Override
    public void stay() {
        System.out.println(" собака встала на задние лапы");
    }

    public void letsPlay() {
        if (haveStick) {
            System.out.println("Игра начинается");
        } else {
            System.out.println("Найдите палку чтобы начать игру");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return haveStick == dog.haveStick && Objects.equals(getName(), dog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveStick, getName());
    }
}
