package ru.turing.courses.lesson2.animals;

public class Bird extends Animal {
    private boolean migration;
    //true - letit na south,false-no
    private String singing;

    public bird(String vid, boolean eatingmeat, int age, boolean wild, boolean migration, String singing) {
        super(vid, eatingmeat, age, wild);
        this.migration = migration;
        this.singing = singing;
    }

    public void makeSound() {
        System.out.println(this.singing);
    }
    }

