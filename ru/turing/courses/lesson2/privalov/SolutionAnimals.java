package ru.turing.courses.lesson2.privalov;

import ru.turing.courses.lesson2.privalov.animals.Capybara;
import ru.turing.courses.lesson2.privalov.animals.Cat;
import ru.turing.courses.lesson2.privalov.animals.GenderEnum;


public class SolutionAnimals {
    public static void main(String[] args) {
        //объявляем экземпляры котов, проверяем реализацию методов из класса Animal
        Cat gosha = new Cat(76, GenderEnum.MALE, "grey", "Маша");
        gosha.giveBirth();
        gosha.makeSound();

        Cat misha = new Cat(75, GenderEnum.MALE, "orange", "Маша");
        System.out.println(gosha.equals(misha)); //проверяем равенство объектов -- false

        Cat persik = new Cat(76, GenderEnum.MALE, "grey", "Маша");
        System.out.println(gosha.equals(persik)); //проверяем равенство объектов -- true

        //объявляем экземпляр капибары, проверяем реализацию методов
        Capybara capy = new Capybara(52, GenderEnum.FEMALE, "Venezuela", true);
        capy.giveBirth();
        capy.makeSound();
    }
}
