package ru.turing.courses.lesson1.Marchinskya;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите ФИО: ");
            String fio = scanner.nextLine();

            System.out.println("Введите дату в формате дд.мм.гггг: ");
            String userDate = scanner.nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = dateFormat.parse(userDate);

            System.out.println("Введите адрес в формате страна: Россия, " +
                    "город: Москва, " +
                    "улица: Авиамоторная, " +
                    "дом: 15, " +
                    "квартира: 24");

            String address = scanner.nextLine();

            AddressFormatter.validate(address);

            String[] addressPrefixes = {"", "г. ", "ул. ", "д. ", "кв. "};
            User user = new User(fio, AddressFormatter.formatAddress(address, "\n", addressPrefixes), date);
            System.out.println(user);
        } catch (ParseException parseException) {
            System.out.println("Неверный формат даты");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
