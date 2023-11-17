package ru.turing.courses.lesson2.animals;

public class wolf extends Animal{
    @Override
    public void eat() {
        System.out.println("кушает мясо");
    }

    @Override
    public int Kol_legs() {
        return 4;
    }
}
