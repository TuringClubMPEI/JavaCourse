package ru.turing.courses.lesson2.animals;
public class Cat extends Animal {
    private boolean funny;

    public Cat(String name, double weight, boolean flying, boolean swimming, boolean funny) {
        super(name, weight, flying, swimming);
        this.funny = funny;
    }

    public boolean isFunny() {
        return funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }

    @Override
    public void makeSound() {
        if (funny) {
            System.out.println("ъеъ");
        } else {
            System.out.println("MEOW");
        }
    }
}

