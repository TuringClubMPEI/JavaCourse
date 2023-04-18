package ru.turing.courses.lesson2.privalov;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProcessor { //объявляем класс
    public static void shortenAddress(String address) { //объявляем и описываем метод выдачи адреса в краткой форме
        String[] shortAddress = address.split(",?\\s?[а-я]+:\\s?");
        String[] prefixes = {"", "", "г. ", "ул. ", "д. ", "кв. "};

        for (int i = 1; i <= 5; i++) {
            System.out.println(prefixes[i] + shortAddress[i]);
        }
    }

    public static void yearsAndMonthsCalculator(String birthDate) { //объявляем и описываем метод подсчета возраста в полных годах и месяцах
        String[] birthDatesStringArr = birthDate.split("\\.");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDateString = formatter.format(date);
        String[] currentDateStringArr = formattedDateString.split("\\.");

        int[] birthDatesIntArr = new int[3];
        int[] currentDatesIntArr = new int[3];
        for (int i = 0; i < 3; i++) {
            birthDatesIntArr[i] = Integer.parseInt(birthDatesStringArr[i]);
            currentDatesIntArr[i] = Integer.parseInt(currentDateStringArr[i]);
        }

        int wholeYears;
        int wholeMonths;

        if (currentDatesIntArr[1] > birthDatesIntArr[1]) {
            if (currentDatesIntArr[0] >= birthDatesIntArr[0]) {
                wholeYears = currentDatesIntArr[2] - birthDatesIntArr[2];
                wholeMonths = currentDatesIntArr[1] - birthDatesIntArr[1] + wholeYears * 12;
            } else {
                wholeYears = currentDatesIntArr[2] - birthDatesIntArr[2];
                wholeMonths = currentDatesIntArr[1] - birthDatesIntArr[1] - 1 + wholeYears * 12;
            }
        } else {
            if (currentDatesIntArr[0] >= birthDatesIntArr[0]) {
                wholeYears = currentDatesIntArr[2] - birthDatesIntArr[2] - 1;
                wholeMonths = 12 - birthDatesIntArr[1] + currentDatesIntArr[1] + wholeYears * 12;
            } else {
                wholeYears = currentDatesIntArr[2] - birthDatesIntArr[2] - 1;
                wholeMonths = wholeYears * 12 + 12 - birthDatesIntArr[1] + currentDatesIntArr[1] - 1;
            }
        }

        System.out.println("Вы прожили " + wholeYears + " полных лет или " + wholeMonths + " полных месяцев.");
    }
}
