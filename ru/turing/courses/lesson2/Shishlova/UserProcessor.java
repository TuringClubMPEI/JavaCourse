package ru.turing.courses.lesson2.Shishlova;

import ru.turing.courses.lesson2.Shishlova.Homework2;


import java.time.LocalDate;
import java.time.Period;

public class UserProcessor {
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