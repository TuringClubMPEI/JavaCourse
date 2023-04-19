package ru.turing.courses.lesson1.Gasin.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользовательских данных
        System.out.println("Введите ваше ФИО");
        String[] fio = scanner.nextLine().split(" ");
        String firstName = fio[1], secondName = fio[2], lastName = fio[0];

        System.out.println("Введите дату рождения в формате дд.мм.гггг");
        String birthDateString = scanner.nextLine();
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(birthDateString);
        } catch (ParseException e) {
            System.out.println("Ошибка! Введите дату в формате дд.мм.гггг");
            return;
        }

        System.out.println("Введите адрес");
        String address = scanner.nextLine();

        Person user = new Person(firstName, secondName, lastName, address, birthDate);
        System.out.println("Отформатированный адрес:");
        System.out.println(user.formatAddress(new UserAddressFormatter()));

        System.out.println("Прожитых лет: " + user.getYears());
        System.out.println("Прожитых месяцев: " + user.getMonths());
    }
}
