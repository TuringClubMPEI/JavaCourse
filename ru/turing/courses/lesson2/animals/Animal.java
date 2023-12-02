package ru.turing.courses.lesson2.animals;

public class Animal {
    protected String name;
    protected String color;
    protected String breed;
    protected int age;
    protected int numberOfPaws;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public void play(String anyActivity) {

    }

    public void sleep(int hoursOfSleep) {

    }

    public void eat(String eat) {

    }

    //напишу конструктор к классу в нутри класса


    public Animal(String name, String color, String breed, int age, int numberOfPaws) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.numberOfPaws = numberOfPaws;
    }
}

