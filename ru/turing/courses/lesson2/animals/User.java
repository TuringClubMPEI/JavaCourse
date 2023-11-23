package ru.turing.courses.lesson2.animals;

import java.time.LocalDate;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);

    public int years() {
        System.out.println("Введите дату рождения");
        String dateOfBirth = scanner.nextLine();
        String[] tune = dateOfBirth.split("\\.");
        int monthBirth = Integer.parseInt(tune[1]);
        int yearBirth = Integer.parseInt(tune[2]);

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int monthToBirth = (year - yearBirth) * 12 + (month - monthBirth);
        return monthToBirth / 12;
    }

    public int month() {
        System.out.println("Введите дату рождения");
        String dateOfBirth = scanner.nextLine();
        String[] tune = dateOfBirth.split("\\.");
        int monthBirth = Integer.parseInt(tune[1]);
        int yearBirth = Integer.parseInt(tune[2]);

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        return (year - yearBirth) * 12 + (month - monthBirth);
    }

    public void addressMy() {
        System.out.println("Введите адрес в формате: страна:, город:, улица:, дом:, квартира:");
        String local = scanner.nextLine();
        String[] address = local.split(", ");
        address[0] = address[0].replaceAll("страна:", "");
        address[1] = address[1].replaceAll("город:", "г.");
        address[2] = address[2].replaceAll("улица:", "ул.");
        address[3] = address[3].replaceAll("дом:", "д.");
        address[4] = address[4].replaceAll("квартира:", "кв.");
        for (String s : address) {
            System.out.println(s);
        }
    }
}