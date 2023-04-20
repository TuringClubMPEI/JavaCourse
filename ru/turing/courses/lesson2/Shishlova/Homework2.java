package ru.turing.courses.lesson2.Shishlova;

import ru.turing.courses.lesson2.Shishlova.Animal.Animal;
import ru.turing.courses.lesson2.Shishlova.Animal.Cat;
import ru.turing.courses.lesson2.Shishlova.Animal.Dog;
import ru.turing.courses.lesson2.Shishlova.Study.StudyingConsole;
import ru.turing.courses.lesson2.Shishlova.UserProcessor;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework2 {
        public static void main (String[]args){
            // создаем объект типа Scanner для считывания пользовательского ввода
            Scanner scanner = new Scanner(System.in);
            // запрашиваем у пользователя ФИО и дату рождения
            System.out.print("Введите свое ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Введите свою дату рождения в формате дд.мм.гггг: ");
            String birthDateString = scanner.nextLine();

            // преобразуем введенную пользователем дату рождения в объект LocalDate
            LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

            // запрашиваем у пользователя адрес и переводим его в краткий формат
            System.out.print("Введите свой адрес в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24': ");
            String fullAddress = scanner.nextLine();
            String shortAddress = UserProcessor.getShortAddress(fullAddress);

            // выводим результаты
            int ageInYears = UserProcessor.calculateAgeInYears(birthDate);
            long ageInMonths = UserProcessor.calculateAgeInMonths(birthDate);
            System.out.println("Вам " + ageInYears + " лет");
            System.out.println("Вы прожили " + ageInMonths + " полных месяцев");


            // создаем объекты наших животных
            Cat cat = new Cat("Уголек", "черный", 7);
            Dog dog = new Dog("Николь", "серая", 40);

            // вызываем методы объектов и выводим результаты
            System.out.println(cat.getName() + " говорит: " + cat.makeSound());
            System.out.println(dog.getName() + " говорит: " + dog.makeSound());
            System.out.println(cat.getName() + " спит: " + cat.sleep());
            System.out.println(dog.getName() + " спит: " + dog.sleep());
        }
    }