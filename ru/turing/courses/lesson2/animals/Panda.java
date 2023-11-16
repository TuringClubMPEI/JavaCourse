package ru.turing.courses.lesson2.animals;

public class Panda extends Animal {
    //Интересный факт - У 90 из 100 панд есть дополнительный палец для карабканья по деревьям
    protected boolean hasSixFingers;

    @Override
    public void makeSound() {
        System.out.println("А какой звук издают панды??");
        System.out.println("*звуки панды*");
    }

    @Override
    public void eat() {
        System.out.println("Панда жует бамбук лол");
    }

    public void fallFromTree() {
        System.out.println("Панда упала с дерева :(");
    }

    public boolean isHasSixFingers() {
        return hasSixFingers;
    }

    public void setHasSixFingers(boolean hasSixFingers) {
        this.hasSixFingers = hasSixFingers;
    }

    public Panda(int age, String color, boolean hasSixFingers) {
        super(age, color);
    }
}
