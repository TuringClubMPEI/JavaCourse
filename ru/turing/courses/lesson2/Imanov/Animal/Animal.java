package ru.turing.courses.lesson2.Imanov.Animal;

import java.util.Objects;

public abstract class Animal {

    // поля которые есть у каждого животного
    protected String name;
    protected int age;
    protected Gender sex;
    protected int mood;


    // функции-члены класса которые нужно будет реализовать в наследниках
    public abstract void voice();
    public abstract void sleep();


    // конструктор
    public Animal(String name, int age, Gender sex, int mood){
        this.name = name;
        this.age = Math.max(age, 0);
        this.sex = sex;
        if (mood > 100) {
            this.mood = 100;
        } else if (mood < 0) {
            this.mood = 0;
        } else {
            this.mood = mood;
        }
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getSex() {
        return sex;
    }

    public int getMood() {
        return mood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("wrong age");
        }
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public void setMood(int mood) {
        if (mood >= 0 && mood <= 100) {
            this.mood = mood;
        } else {
            System.out.println("wrong mood");
        }
    }
}
