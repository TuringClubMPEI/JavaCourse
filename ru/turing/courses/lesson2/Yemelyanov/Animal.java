package ru.turing.courses.lesson2.Yemelyanov;

public abstract class Animal {
    protected int penisLength; //:D
    protected String color;
    public abstract void getSound();
    public abstract void classifyAnimal();
    public abstract void getPenisLength();

    public void sayAlive(){
        System.out.println("Я жив, покуда верю в чудо");
    }
}
