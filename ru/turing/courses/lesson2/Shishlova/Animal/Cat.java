package ru.turing.courses.lesson2.Shishlova.Animal;

import ru.turing.courses.lesson2.Shishlova.Animal.Animal;
import ru.turing.courses.lesson2.Shishlova.Animal.Dog;

// класс кошка (наследник класса животное)
import java.util.Objects;

public class Cat extends Animal {
    // новое поле кошки
    private int age;

    // конструктор кошки
    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    // реализация метода makeSound() для кошки
    public String makeSound() {
        return "Мяу";
    }

    // переопределение метода sleep() для кошки
    public String sleep() {
        return "Кошка спит...";
    }

    // геттер для поля age
    public int getAge() {
        return age;
    }

    // переопределение метода equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    // переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
