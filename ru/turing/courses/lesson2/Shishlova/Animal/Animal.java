package ru.turing.courses.lesson2.Shishlova.Animal;

import ru.turing.courses.lesson2.Shishlova.Animal.Dog;
import ru.turing.courses.lesson2.Shishlova.Animal.Cat;

// класс животное (абстрактный)
   public abstract class Animal {
    // поля животного
    protected String name;
    protected String color;

    // конструктор животного
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // метод, который будет реализован в дочерних классах
    public abstract String makeSound();

    // метод животного "спать"
    public String sleep() {
        return "zzz";
    }

    // геттер для поля name
    public String getName() {
        return name;
    }

    // геттер для поля color
    public String getColor() {
        return color;
    }
}
