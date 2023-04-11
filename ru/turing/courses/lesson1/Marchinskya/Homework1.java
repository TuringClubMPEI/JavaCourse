package ru.turing.courses.lesson1.Marchinskya;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ФИО: ");
            String fio = scanner.nextLine();

            System.out.println("Введите дату в формате дд.мм.гггг: ");
            String userDate = scanner.nextLine();
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date;

            try {
                date = LocalDate.parse(userDate, dateFormat);
            } catch (DateTimeParseException parseException) {
                System.out.println("Неверный формат даты");
                return;
            }

            System.out.println("Введите адрес в формате страна: Россия, " +
                    "город: Москва, " +
                    "улица: Авиамоторная, " +
                    "дом: 15, " +
                    "квартира: 24");

            String address = scanner.nextLine();

            User user = new User(fio, AddressFormatter.formatAddress(address, "\n"), date);
            System.out.println(user);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка!");
        }
    }
}
