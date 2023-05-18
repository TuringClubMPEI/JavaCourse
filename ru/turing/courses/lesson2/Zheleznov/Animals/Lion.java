package ru.turing.courses.lesson2.Zheleznov.Animals;

import java.util.Objects;

public class Lion extends Animal {
    public Lion(String name, int length, int legsCount) {
        super(name, length, legsCount);
    }

    @Override
    public void soundAnimal() {
        System.out.println(getName() + " выкрикнул с недовольством рааар");
    }

    @Override
    public void stay() {
        System.out.println("Лев встал на задние лапы");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Objects.equals(getName(), lion.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
