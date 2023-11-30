package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    protected String type;
    protected int age;
    protected String color;
    protected double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public void eat() {
        weight += 1;
    }

    public void sleep() {
        System.out.println("Zzzzz");
    }
}
