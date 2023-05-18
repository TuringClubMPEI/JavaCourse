package ru.turing.courses.lesson2.Karashtina;

import java.util.Objects;

public class Penguin extends Animal {
    // Определяем поле класса
    private int wingspan;

    // Создаем конструктор класса
    public Penguin(String type, String colour, int wingspan) {
        super(type, colour);
        this.wingspan = wingspan;
    }

    // Переопределяем абстрактные методы
    @Override
    public void makeSound() {
        System.out.println("Писк");
    }

    @Override
    public void printHabitat() {
        System.out.println("Пингвины обитают в открытом море Южного полушария");
    }

    // Создаем новый метод для этого класса
    public void swim() {
        System.out.println("Пингвины умеют плавать");
    }

    // Переопределяем equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Penguin)) return false;
        Penguin penguin = (Penguin) o;
        return wingspan == penguin.wingspan && getType().equals(penguin.getType()) && getColour().equals(penguin.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingspan, getColour(), getType());
    }
}

