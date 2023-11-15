package ru.turing.courses.lesson2.animals;

public class Animal {
    protected String klichka;
    protected String color;
    protected String breed;
    protected int age;

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
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

    protected int numberOfPaws;

    public void play(String anyActivity){

    }

    public void sleep(int hoursOfSleep){

    }

    public void eat(String eat){

    }

    //напишу конструктор к классу в нутри класса

    public Animal(String klichka, String color, String breed, int age, int numberOfPaws) {
        this.klichka = klichka;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.numberOfPaws = numberOfPaws;
    }
}

