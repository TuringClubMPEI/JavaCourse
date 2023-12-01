package ru.turing.courses.lesson3;


import ru.turing.courses.lesson3.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Dog tim = new Dog("Timmy", 7);
        Dog bob = new Dog("Bob", 10);
        Dog mitch = new Dog("Mitchy", 1);
        Dog mark = new Dog("Mark", 7);
        Dog pitch = new Dog("Pitch", 10);
        // создаём список всех собак(их много) и регистр всех собак
        List<Dog> dogsLst = new ArrayList<>();
        dogsLst.add(tim);
        dogsLst.add(bob);
        dogsLst.add(mitch);
        dogsLst.add(mark);
        dogsLst.add(pitch);
        // Создаём регистр всех собак
        // * Ключ - ссылка в памяти, значение - имя
        Registry<String, Dog> dogReg = new Registry<>();
        // добавляем всех собак в их общий регистр
        for (Dog currDog: dogsLst) {
            dogReg.add(currDog.getName(), currDog);
        }
        // Принтуем их на экран
        dogReg.printAllItems();
        System.out.println(dogReg.removeByValue(tim));
        dogReg.printAllItems();
    }

    /**
     * Аналогичный пример с котами
     */
    public static void catExample() {}
}