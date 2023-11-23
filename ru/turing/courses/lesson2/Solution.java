package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Animal;
import ru.turing.courses.lesson2.animals.Human;
import ru.turing.courses.lesson2.animals.Bird;
import ru.turing.courses.lesson2.animals.Cat;

public class Solution {
    public static void main(String[] args) {
        Human chelick = new Human("11.11.2003", "Daniil", true, "Moscow,Krasnokazarmenaya st,14 b");
        chelick.livedYearMonths(chelick.getDate());
        System.out.println();
        chelick.adress(chelick.getAdress());
        System.out.println();
        Animal catAnimal = new Cat("cat", true, 3, false, "none", "sfinks");
        catAnimal.isDangerous();
        catAnimal.makeSound();
        Animal vorobeiAnimal = new Bird("vorobei", false, 1, true, true, "chirik-chirik");
        vorobeiAnimal.makeSound();
    }

}



