package ru.turing.courses.lesson2.Shishlova;

import ru.turing.courses.lesson2.Shishlova.Animal.Animal;
import ru.turing.courses.lesson2.Shishlova.Study.Study;
import ru.turing.courses.lesson2.Shishlova.Animal.Cat;
import ru.turing.courses.lesson2.Shishlova.Animal.Dog;
import ru.turing.courses.lesson2.Shishlova.Study.StudyingConsole;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Objects;

public class Homework2 {
    public Homework2() {
        super();
    }

    public static class UserProcessor {
        // метод для подсчета полных лет пользователя
        public static int calculateAgeInYears(LocalDate birthDate) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }

        // метод для подсчета полных месяцев, которые пользователь прожил
        public static long calculateAgeInMonths(LocalDate birthDate) {
            return Period.between(birthDate, LocalDate.now()).toTotalMonths();
        }

        // метод для преобразования полного адреса пользователя в краткий формат
        public static String getShortAddress(String fullAddress) {
            String[] addressParts = fullAddress.split(", ");
            String country = addressParts[0].split(": ")[1];
            String city = addressParts[1].split(": ")[1];
            String street = addressParts[2].split(": ")[1];
            String house = addressParts[3].split(": ")[1];
            String apartment = addressParts[4].split(": ")[1];
            return country + "\n" + "г. " + city + "\n" + "ул. " + street + "\n" + "д. " + house + "\n" + "кв. " + apartment;
        }
    }


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