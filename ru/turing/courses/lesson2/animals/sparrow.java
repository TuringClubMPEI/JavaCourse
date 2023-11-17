package ru.turing.courses.lesson2.animals;

public class sparrow extends Animal{
    @Override
    public void eat() {
        System.out.println("кушает семечки");
    }

    @Override
    public int Kol_legs() {
        return 2;
    }
}
