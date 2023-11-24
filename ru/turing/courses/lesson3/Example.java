package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.animals.Cat;
import ru.turing.courses.lesson2.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        dogExample();
    }

    /**
     *  Пример с собаками
     */
    public static void dogExample() {
        Dog tim = new Dog("Timmy", 7);
        Dog bob = new Dog("Bob", 10);
        Dog mitch = new Dog("Mitchy", 1);
        Dog mark = new Dog("Mark", 7);
        Dog pitch = new Dog("Pitch", 10);
        Dog dvr = new Dog(" ", 1);
        // создаём список всех собак(их много) и регистр всех собак
        List<Dog> dogsLst = new ArrayList<>();
        dogsLst.add(tim);
        dogsLst.add(bob);
        dogsLst.add(mitch);
        dogsLst.add(mark);
        dogsLst.add(pitch);
        dogsLst.add(dvr);
        // Создаём регистр всех собак
        // * Ключ - ссылка в памяти, значение - имя
        Registry<Dog, String> dogReg = new Registry<>();
        // добавляем всех собак в их общий регистр
        for (Dog currDog: dogsLst) {
            dogReg.add(currDog, currDog.getName());
        }
        // Принтуем их на экран
        dogReg.printAllItems();
    }

    /**
     * Аналогичный пример с котами
     */
    public static void catExample() {
        Cat bars = new Cat("Barsik", 3);
    }
}
