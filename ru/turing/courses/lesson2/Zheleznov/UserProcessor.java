package ru.turing.courses.lesson2.Zheleznov;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserProcessor {
    public static void userProcessor(String dateOfBirth, String address) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthday = LocalDate.parse(dateOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        Period livedLife = Period.between(birthday, currentDate);
        int years = livedLife.getYears();
        int months = livedLife.getMonths() + years * 12;
        System.out.println("Полных лет: " + years + " полных месяцев: " + months);

//делаю вывод в соответствии с заданием
        String[] prefixes = new String[]{"", "г. ", "ул. ", "д. ", "кв. "};
        String[] addressMas = address.split(",");
        for (int i = 0; i < addressMas.length; i++) {
            final String[] massif = addressMas[i].split(": ");
            System.out.println(prefixes[i] + massif[1]);
        }
    }

}
