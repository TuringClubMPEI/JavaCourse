package ru.turing.courses.lesson2.Yemelyanov;

public abstract class Animal {
    protected int penisLength; //:D
    protected String color;

    public Animal(int penisLength, String color) {
        this.penisLength = penisLength;
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void classify();
    public int getPenisLength(){
        return penisLength;
    }
    public abstract void printPenisLength();
    public void setPenisLength(int penisLength) {
        this.penisLength = penisLength;
    }

    public void sayAlive(){
        System.out.println("Я жив, покуда верю в чудо");
    }
}
