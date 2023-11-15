package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    protected String type;
    protected int year;
    protected String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected double weight;


    public void sound() {}
    public void eat() {
        weight += 1;
    }
    public void sleep() {
        System.out.println("I'm sleeping.... ZzzzZ");
    }

}
