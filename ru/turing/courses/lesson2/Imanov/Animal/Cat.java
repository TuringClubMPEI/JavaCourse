package ru.turing.courses.lesson2.Imanov.Animal;

import java.util.Objects;

public class Cat extends Animal {
    // не все кошки умеют пережёвывать пищу
    private boolean canChew;

    // конструктор
    public Cat(String name, int age, Gender sex, int mood, boolean canChew) {
        super(name, age, sex, mood);
        this.canChew = canChew;
    }

    // переопределенные функции-члены класса абстрактного родителя
    @Override
    public void voice() {
        System.out.println("Мяу, пацаны, мяу");
    }

    @Override
    public void sleep() {
        if (this.mood <= 50) {
            this.mood += 50;
        } else {
            this.mood = 100;
        }
    }

    // геттер и сеттер
    public boolean isCanChew() {
        return canChew;
    }

    public void setCanChew(boolean canChew) {
        this.canChew = canChew;
    }

    // котята играю с пакетами
    public void playWithPack(){
        this.mood = 100;
    }

    // переопределенные функции-члены класса из Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && mood == cat.mood && Objects.equals(name, cat.name)
                && sex == cat.sex && canChew == cat.canChew;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canChew);
    }
}
