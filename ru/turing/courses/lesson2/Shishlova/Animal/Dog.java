package ru.turing.courses.lesson2.Shishlova.Animal;

import ru.turing.courses.lesson2.Shishlova.Animal.Animal;
import ru.turing.courses.lesson2.Shishlova.Animal.Cat;



import java.util.Objects;

// класс собака (наследник класса животное)
   public class Dog extends Animal {
    // новое поле собаки
    private int weight;

    // конструктор собаки
    public Dog(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    // реализация метода makeSound() для собаки
    public String makeSound() {
        return "Гав";
    }

    // геттер для поля weight
    public int getWeight() {
        return weight;
    }

    // переопределение метода equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight && Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    // переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }
}
