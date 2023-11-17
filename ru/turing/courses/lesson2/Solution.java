package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Cat;
import ru.turing.courses.lesson2.animals.Dog;

public class Solution {
    public static void main(String[] args) {
        // Dog
        Dog dog1 = new Dog("Ricky", 2);
        dog1.setColor("Brown");
        dog1.sound();
        dog1.goForAWalk();


        // Cat
        Cat cat1 = new Cat();
        cat1.sound();
        cat1.setName("Barsik");
        System.out.println(cat1.getName());
        cat1.setMiceCount(3);
        cat1.cath_mouse();
        System.out.println(cat1.getHapiness());
        System.out.println(cat1.getMiceCount());

        // User
        User leviAkkerman = new User("Levi Akkerman");
        leviAkkerman.setAddress();
        leviAkkerman.setBirth();

    }

}
