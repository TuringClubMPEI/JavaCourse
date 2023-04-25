package ru.turing.courses.lesson2.Zheleznov;

import java.util.Scanner;

import static ru.turing.courses.lesson2.Zheleznov.UserProcessor.processUserInfo;

import ru.turing.courses.lesson2.Zheleznov.Animals.Animal;
import ru.turing.courses.lesson2.Zheleznov.Animals.Dog;
import ru.turing.courses.lesson2.Zheleznov.Animals.Lion;
import ru.turing.courses.lesson2.Zheleznov.Study.Student9thClass;
import ru.turing.courses.lesson2.Zheleznov.Study.Student11thClass;


public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//прошу ввести данные пользователя с клавиатуры
        System.out.println("Введите свое ФИО");
        String initiatives = scanner.nextLine();
        System.out.println("Введите дату рождения в формате: дд.мм.гггг");
        String dateOfBirth = scanner.nextLine();
        System.out.println(" Введите свой адрес в формате: страна:, город:, улица:, дом:, квартира:");
        String address = scanner.nextLine();
        //использую метод из класса UserProcessor
        processUserInfo(dateOfBirth, address);


        Dog dog = new Dog("Шарик", 40, 4, true);
        Animal lion = new Lion("Бонифаций", 140, 4);
        dog.soundAnimal();
        dog.LetsPlay();
        lion.stay();
        lion.soundAnimal();


        Dog adultDog = new Dog("Шарик", 80, 4, false);
        Dog dog1 = new Dog("Шарик", 40, 4, true);

        System.out.println(dog.equals(adultDog));//false
        System.out.println(dog.equals(dog1));//true

        Student9thClass student9th = new Student9thClass(true, false, true);
        Student11thClass student11th = new Student11thClass(true, 76, 90);
        student9th.passExam(true);
        student11th.study();
    }
}