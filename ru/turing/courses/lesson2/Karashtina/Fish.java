package ru.turing.courses.lesson2.Karashtina;

import java.util.Objects;

public class Fish extends Animal {
    // Определяем поле класса
    private int speed;

    // Создаем конструктор класса
    public Fish(String type, String colour, int speed) {
        super(type, colour);
        this.speed = speed;
    }

    // Переопределяем абстрактные методы
    @Override
    public void makeSound() {
        System.out.println("Буль-буль");
    }

    @Override
    public void printHabitat() {
        System.out.println("Рыбы обитают в морях и океанах, а также в пресных водоемах");
    }

    // Создаем новый метод для этого класса
    public void cookingMethod() {
        System.out.println("Приготовить маринад. Разогреть духовку до 175 градусов. Запекать рыбу около 20 минут.");
    }

    // Переопределяем equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        Fish fish = (Fish) o;
        return speed == fish.speed && getType().equals(fish.getType()) && getColour().equals(fish.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, getColour(), getType());
    }
}