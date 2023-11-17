package ru.turing.courses.lesson2.animals;

public class Dog extends Animal {
    private boolean owner_missing; // 1 or 0
    private boolean is_alone_at_home;
    private double hapiness;

    public void setOwner_missing(boolean owner_missing) {
        this.owner_missing = owner_missing;
    }

    public boolean isIs_alone_at_home() {
        return is_alone_at_home;
    }

    public double getHapiness() {
        return hapiness;
    }

    public void setHapiness(double hapiness) {
        this.hapiness = hapiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {this.name = name; this.age = age;}

    @Override
    public void sound() {
        System.out.println("Gav!Gav!Gav!");
    }

    public boolean isOwner_missing() {
        return owner_missing;
    }

    public void goForAWalk() {
        this.hapiness += 5.0;
    }

    public void setIs_alone_at_home(boolean aloneAtHome) {
        this.is_alone_at_home = aloneAtHome;
        if (aloneAtHome) {
            this.owner_missing = true;
            this.hapiness -= 1.0;
        }

    }


}
