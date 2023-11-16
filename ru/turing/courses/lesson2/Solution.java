package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Panda;
import ru.turing.courses.lesson2.animals.Whale;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        User user = new User(LocalDate.of(2004, 6, 10),
                "страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24");
        System.out.println(user.getLivedMonths());
        System.out.println(user.getLivedYears());
        user.printShortAddress();
        System.out.println(user.getAddress());

        Whale whiteWhale = new Whale(50, "white", false);
        Panda blackPanda = new Panda(5, "black", true);

        whiteWhale.eat();
        whiteWhale.makeSound();
        whiteWhale.blubber();

        blackPanda.eat();
        blackPanda.makeSound();
        blackPanda.fallFromTree();
    }
}
