package ru.turing.courses.lesson2.animals;

public class Capibara extends Animal {
    private boolean haveOrange;

    public Capibara(String name, double weight, boolean flying, boolean swimming, boolean haveOrange) {
        super(name, weight, flying, swimming);
        this.haveOrange = haveOrange;
    }

    public boolean isHaveOrange() {
        return haveOrange;
    }

    public void setHaveOrange(boolean haveOrange) {
        this.haveOrange = haveOrange;
    }

    @Override
    public void makeSound() {
        System.out.println("Всем привет! Я капибара " + getName());
    }
}

