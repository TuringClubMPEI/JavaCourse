package ru.turing.courses.lesson2.animals;

public class Bird extends Animal {
    private boolean migration;
    //true - letit na south,false-no
    private String singing;

    public Bird(String type, boolean eatingMeat, int age, boolean wild, boolean migration, String singing) {
        super(type, eatingMeat, age, wild);
        this.migration = migration;
        this.singing = singing;
    }

    @Override
    public void makeSound() {
        System.out.println(this.singing);
    }
}

