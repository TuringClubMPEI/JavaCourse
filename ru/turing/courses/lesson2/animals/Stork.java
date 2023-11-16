package ru.turing.courses.lesson2.animals;

public class Stork extends Animal{
    //размах крыльев
    private int wingspan;
    //длина клюва
    private int lengthBeak;

    public Stork(String name, boolean isHerbivore, double weight, int wingspan, int lengthBeak) {
        super(name, isHerbivore, weight);
        this.wingspan = wingspan;
        this.lengthBeak = lengthBeak;
    }

    @Override
    public void printFood() {
        System.out.println("лягушки, мелкие млекопитающие, мелкие птицы");
    }

    @Override
    public void printLifeTime() {
        System.out.println("примерно 20-21 год");
    }

    @Override
    public void printMakeSound() {
        System.out.println("хлопают");
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getLengthBeak() {
        return lengthBeak;
    }

    public void setLengthBeak(int lengthBeak) {
        this.lengthBeak = lengthBeak;
    }
}
