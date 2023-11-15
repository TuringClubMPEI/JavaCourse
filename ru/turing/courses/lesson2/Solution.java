package ru.turing.courses.lesson2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Task-1
        String name1 = "Aboba";
        User aboba = getUser(name1);
        ZoneId z = ZoneId.of( "Europe/Moscow" );
        ZonedDateTime date2 = ZonedDateTime.now(z);
        String date = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(date2);

        System.out.println(aboba.getDateOfBirth());
        System.out.println(date);
        aboba.printYearsLived();
        aboba.printMonthsLived();
        aboba.printAdress();

        // Task-2

        // реализации классов (abstract)Animal, Flea, Donkey
    }

    private static User getUser(String name1) {
        String dateOfBirth1 = "14/08/1990";
        int dayOfBirth1 = 14;
        int monthOfBirth1 = 12;
        int yearOfBirth1 = 1990;
        String country1 = "Russia";
        String index1 = "111222";
        String city1 = "Moscow";
        String street1 = "Trubnaya";
        String house1 = "34";
        String flat1 = "392";
        return new User(name1, dateOfBirth1, dayOfBirth1, monthOfBirth1, yearOfBirth1,
                country1, index1, city1, street1, house1, flat1);
    }
}
