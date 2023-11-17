package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Panda;
import ru.turing.courses.lesson2.animals.Stork;

public class Solution {
    public static void main(String[] args) {
        Panda animal1 = new Panda("панда", false, 70, "Сычуань", 12);
        Stork animal2 = new Stork("аист", false, 3.5, 120, 16);
        System.out.println("Название животного");
        System.out.println(animal1.getName());
        System.out.println("Продолжительность жизни животного");
        animal1.printLifeTime();
        System.out.println("Регион Китая, в котором живет");
        System.out.println(animal1.getRegionOfChina());
        System.out.println("Рацион");
        animal1.printFood();
        System.out.println("Название животного");
        System.out.println(animal2.getName());
        System.out.println("Продолжительность жизни животного");
        animal2.printLifeTime();
        System.out.println("Размах крыла");
        System.out.println(animal2.getWingspan());
        System.out.println("Рацион");
        animal2.printFood();
    }
}
