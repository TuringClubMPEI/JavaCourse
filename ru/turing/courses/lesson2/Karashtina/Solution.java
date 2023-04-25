package ru.turing.courses.lesson2.Karashtina;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем дату рождения пользователя
        System.out.println("Введите Вашу дату рождения (в формате дд.мм.гггг): ");
        String birthdayString = scanner.nextLine();

        // Считываем адрес пользователя
        System.out.println("Введите Ваш адрес одной строкой");
        String address = scanner.nextLine();

        // Обращаемся к классу UserProcessor и выводим результаты методов
        UserProcessor user = new UserProcessor();
        user.calculateAge(birthdayString);
        user.formatTheAddress(address);

        // Создаем два объекта класса Fish
        Animal fishAnimal = new Fish("Дорадо", "Серебристый", 80);
        Animal fishAnimal2 = new Fish("Дорадо", "Серый", 75);

        // Выводим результаты работы методов класса Fish
        fishAnimal.makeSound();
        fishAnimal.printHabitat();
        fishAnimal.foodExtraction();
        fishAnimal.sleep();

        // Создаем два объекта класса Penguin
        Animal penguinAnimal = new Penguin("Императорский пингвин", "Черный с белым", 150);
        Animal penguinAnimal2 = new Penguin("Императорский пингвин", "Черный с белым", 150);
        // Выводим результаты работы методов класса Penguin
        penguinAnimal.makeSound();
        penguinAnimal.printHabitat();
        penguinAnimal.foodExtraction();

        // Сравниваем объекты
        System.out.println(fishAnimal.equals(fishAnimal2));
        System.out.println(penguinAnimal.equals(penguinAnimal2));
    }
}
