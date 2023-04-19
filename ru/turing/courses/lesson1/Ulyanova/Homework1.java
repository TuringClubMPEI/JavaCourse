package ru.turing.courses.lesson1.Ulyanova;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String surname = in.nextLine();
        //  System.out.println(surname);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите отчетсво:");
        String secondname = in.nextLine();

        //работа с датой рождения
        System.out.println("Введите дату рождения в формате дд.мм.гггг:");
        String birthday = in.nextLine();
        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birth = LocalDate.parse(birthday, format);
        long months = ChronoUnit.MONTHS.between(birth, today);
        long years = ChronoUnit.YEARS.between(birth, today);
        System.out.printf(months + "mounth");
        System.out.printf(years + "years");
        System.out.println();

        //работа с адресом
        System.out.println("Введите каждую часть адреса через пробел");
        System.out.println("Страна, город, улица, номер дома, номер квартиры");
        String adres = in.nextLine();
        String[] sadres = adres.split(" ");
        for (String word : sadres) {
            System.out.println(word);
        }

    }
}
