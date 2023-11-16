package ru.turing.courses.lesson2.animals;

public class Dog extends Animal {
    private double hapiness;
    private boolean is_a_good_boy = true;
    private double woolLength;

    public double getHapiness(double hapiness) {
        return hapiness;
    }

    public double getWoolLength(double woolLength) {
        return woolLength;
    }

    public void walking() {
        this.hapiness += 5.0;
    }

    public void owner_missing() {
        this.hapiness -= 10.0;
    }

    public void visitGroomer() {
        this.woolLength -= 5.0;
    }
}
