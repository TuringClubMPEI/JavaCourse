package ru.turing.courses.lesson2.Karashtina;

public abstract class Animal {

    // Определяем поля класса
    private String type;
    private String colour;

    // Создаем конструктор класса
    public Animal(String type, String colour) {
        this.setType(type);
        this.setColour(colour);
    }

    public String getType() {
        return type;
    }

    // Получаем доступ к данным уже созданных полей
    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Создаем абстрактные методы
    public abstract void makeSound();

    public abstract void getHabitat();

    // Создаем методы
    public void sleep() {
        System.out.println("Все животные спят");
    }

    public void foodExtraction() {
        System.out.println("Все животные добывают себе пищу");
    }
}
