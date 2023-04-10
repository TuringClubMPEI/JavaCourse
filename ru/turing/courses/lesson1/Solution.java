package ru.turing.courses.lesson1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                // Считываем ФИО пользователя
                System.out.println("Введите Ваше ФИО: ");
                String fullName = scanner.nextLine();

                // Считываем дату рождения пользователя
                System.out.println("Введите Вашу дату рождения (в формате дд.мм.гггг): ");
                String birthdayString = scanner.nextLine();

                // Считываем адрес пользователя
                System.out.println("Введите Ваш адрес одной строкой");
                String address = scanner.nextLine();
                // Разбиваем адрес на части по запятой
                String[] parts = address.split(", ");

                // Обрабатываем каждую часть адреса, получая необходимый формат
                String country = parts[0].split(": ")[1];
                String city = parts[1].split(": ")[1];
                String street = parts[2].split(": ")[1];
                String house = parts[3].split(": ")[1];
                String flat = parts[4].split(": ")[1];

                // Форматируем дату рождения в соответствии с шаблоном
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate birthday = LocalDate.parse(birthdayString, formatter);

                // Вычисляем количество полных лет и месяцев пользователя
                LocalDate currentDate = LocalDate.now();
                Period age = Period.between(birthday, currentDate);
                int years = age.getYears();
                int months = age.getMonths() + years * 12;

                // Выводим результат
                System.out.println("Количество полных лет: " + years + ", количество прожитых месяцев: " + months);
                // Выводим адрес в кратком формате
                System.out.println(country);
                System.out.println("г. " + city);
                System.out.println("ул. " + street);
                System.out.println("д. " + house);
                System.out.println("кв. " + flat);
    }
}
