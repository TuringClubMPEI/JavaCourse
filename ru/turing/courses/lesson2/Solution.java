package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Donkey;
import ru.turing.courses.lesson2.animals.Flea;

public class Solution {
    public static void main(String[] args) {
        // Task 1
        User aboba = new User("Aboba", "14/12/1990", "Russia", "111222",
                "Moscow", "Trubnaya", "34", "392");

        System.out.println(aboba.getDateOfBirth());
        System.out.println(User.dateFromMoscow());
        aboba.printYearsLived();
        aboba.printMonthsLived();
        aboba.printAdress();
        System.out.print("\n-------------------\n\n");

        // Task 2.1
        Donkey berserk = new Donkey("Berserk", false, true, 4,
                4, 30, 0, true);
        Donkey padawan1 = new Donkey("Ragey", false, false, 4,
                2, 10, 0, true);
        Donkey padawan2 = new Donkey("Starey", false, false, 4,
                1, 8, 0, true);
        Donkey padawan3 = new Donkey("Saddey", false, false, 4,
                2, 13, 0, true);

        berserk.makeSound();
        berserk.doSport(45);
        berserk.makeSound();
        for (int trainingTime = 1; trainingTime <= 5; trainingTime++) {
            padawan1.doSport(trainingTime * 45);
            padawan1.makeSound();
        }
        padawan2.makeSound();
        berserk.makeSound();
        for (int trainingTime = 1; trainingTime < 5; trainingTime++) {
            padawan2.doSport(trainingTime * 45);
            padawan2.makeSound();
        }
        berserk.makeSound();
        while (padawan3.tryLoad(20) == 0) {
            padawan3.doSport(180);
            padawan3.makeSound();
        }
        padawan3.makeSound();
        berserk.makeSound();
        System.out.print("\n\n-------------------\n\n");

        // Task 2.2

        Flea hater1 = new Flea("Fasty", false, false, 6,
                3, 2, true, true);
        Flea hater2 = new Flea("Maddy", false, false, 6,
                4, 5, true, false);
        Flea haterMain = new Flea("Freddy", true, true, 6,
                5, 4, true, true);
        Flea justJump = new Flea("Jumpy", false, false, 6,
                2, 3, true, false);

        fleaFight(hater1, haterMain);
        System.out.print("-----------\n");
        fleaFight(hater2, haterMain);
        System.out.print("-----------\n");
        haterMain.makeSound();
        haterMain.heal();
        fleaFight(haterMain, haterMain);
        System.out.print("-----------\n");
        while (justJump.isAlive()) {
            justJump.tryJump(3 / (Math.random() * 1.5));
        }
    }
    public static void fleaFight(Flea character, Flea main) {
        int tries = 0;
        while (character.isAlive() && tries <= 12) {
            tries++;
            character.makeSound();
            character.tryKill();
            character.tryJump(tries / (Math.random() * 5));
        }
        main.makeSound();
        character.heal();
    }
}
