package ru.turing.courses.lesson2.shatunov.animals.basic;

public class Animal {
    private String name;
    private int age;
    private float weight;

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(float foodAmount){
        if (foodAmount <= 0){
            return;
        }
        weight += foodAmount;
    }

    public void move(){
        if (weight < 1){
            return;
        }
        weight -= 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }
}
