package ru.turing.courses.lesson2.animals;

public class Animal {
    private String name;
    private int legs;
    private String sex;
    private int age;

    public void run() {
        System.out.println("бежать");
    }

    public void makeSound() {
        System.out.println("издать звук");
    }

    public Animal(String name, int legs, String sex, int age) {
        this.name = name;
        this.legs = legs;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
