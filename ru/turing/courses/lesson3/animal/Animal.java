package ru.turing.courses.lesson3.animal;

public abstract class Animal {
    protected String type;
    protected int age;
    protected String color;

    protected double weight;

    public Animal() {}
    public Animal(String type, int year, String color) {this.type = type;this.age = year;this.color = color;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return age;
    }

    public void setYear(int age) {
        this.age = age;
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



    public void sound() {}
    public void eat() {
        weight += 1;
    }
    public void sleep() {
        System.out.println("I'm sleeping.... ZzzzZ");
    }

}
