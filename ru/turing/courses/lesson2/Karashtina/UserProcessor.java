package ru.turing.courses.lesson2.Karashtina;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserProcessor {
    public void calculateAge(String birthdayString) {
        // Форматируем дату рождения в соответствии с шаблоном
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthday = LocalDate.parse(birthdayString, formatter);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthday, currentDate);
        int years = age.getYears();
        int months = age.getMonths() + years * 12;

        // Выводим результат
        System.out.println("Количество полных лет: " + years + ", количество прожитых месяцев: " + months);
    }

    public void formatTheAddress(String address) {
        // Разбиваем адрес на части по запятой
        String[] parts = address.split(", ");

        // Обрабатываем каждую часть адреса, получая необходимый формат
        String country = parts[0].split(": ")[1];
        String city = parts[1].split(": ")[1];
        String street = parts[2].split(": ")[1];
        String house = parts[3].split(": ")[1];
        String flat = parts[4].split(": ")[1];

        // Выводим адрес в кратком формате
        System.out.println(country);
        System.out.println("г. " + city);
        System.out.println("ул. " + street);
        System.out.println("д. " + house);
        System.out.println("кв. " + flat);
    }
}
