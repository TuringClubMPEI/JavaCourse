package ru.turing.courses.lesson1.Gasin.simple;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользовательских данных
        System.out.println("Введите ваше ФИО");
        String fio = scanner.nextLine();
        System.out.println("Введите дату рождения");
        String birthDateAsString = scanner.nextLine();
        System.out.println("Введите адрес");
        String address = scanner.nextLine();

        // Вычисление полных лет и месяцев
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(birthDateAsString, formatter);
        long years = ChronoUnit.YEARS.between(birthDate, currentDate);
        long months = ChronoUnit.MONTHS.between(birthDate, currentDate);
        System.out.printf("Вы прожили %d лет и %d месяцев%n", years, months);
        System.out.println();

        // Работа с адресом
        String[] addressParts = address
                .replaceAll("страна: ", "")
                .replaceAll("город:", "г.")
                .replaceAll("улица:", "ул.")
                .replaceAll("дом:", "д.")
                .replaceAll("квартира:", "кв.")
                .split(", ");
        String resultAddress = "";
        for (String addressPart: addressParts) {
            resultAddress += addressPart.trim() + "\n"; // перенос строки
        }
        System.out.println("Отформатированный адрес");
        System.out.println(resultAddress);
    }
}
