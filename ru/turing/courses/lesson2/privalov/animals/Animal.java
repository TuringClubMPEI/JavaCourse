package ru.turing.courses.lesson2.privalov.animals;

public abstract class Animal { //объявляем класс
    //описываем поля, которые есть у  всех животных
    protected int lengthInCm; //средняя длина особи
    protected GenderEnum gender; //пол из соответствующего enum'a

    //объявляем общие методы
    protected abstract void giveBirth(); //родить потомство

    protected abstract void makeSound(); //издать звук

    //конструктор, геттеры и сеттеры через alt+ins
    public Animal(int lengthInCm, GenderEnum gender) {
        this.lengthInCm = lengthInCm;
        this.gender = gender;
    }

    public int getLengthInCm() {
        return lengthInCm;
    }

    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}
