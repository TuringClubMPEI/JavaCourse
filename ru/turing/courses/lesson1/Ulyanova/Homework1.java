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
        System.out.println(months + " month");
        System.out.println(years + " years");

        //работа с адресом
        System.out.println("Введите адрес проживания согласно формату");
        System.out.println("страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24");
        String adres = in.nextLine();
        String[] sadres = adres.split(", ");
        String country = sadres[0].split(": ")[1];
        String city = sadres[1].split(": ")[1];
        String street = sadres[2].split(": ")[1];
        String house = sadres[3].split(": ")[1];
        String room = sadres[4].split(": ")[1];
        System.out.println(country);
        System.out.println("г."+city);
        System.out.println("ул."+street);
        System.out.println("д."+house);
        System.out.println("кв."+room);
    }
}
