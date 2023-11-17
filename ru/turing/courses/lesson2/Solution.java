package ru.turing.courses.lesson2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите фио: ");//Ввод фио и проверка корректности
            String fio = in.nextLine();
            String[] fioSplit = fio.split(" ");
            if(fioSplit.length != 3){
                System.out.println("Неправильно введенный фио!\n");
                return;
            }
            String name = fioSplit[1];
            String surname = fioSplit[0];
            String patronymic = fioSplit[2];

            System.out.println("Введите дату рождения (дд.мм.гггг):");//Ввод даты рождения и проверка корректности
            String dateStr = in.next();
            String[] dateSplit = dateStr.split("\\.");
            if (dateSplit.length != 3) {
                System.out.println("Неверная дата!\n");
                return;
            }
            LocalDate date = LocalDate.parse(dateSplit[2] + "-" + dateSplit[1] + "-" + dateSplit[0]);

            System.out.println("Введите адрес (страна: *, город: *, улица: *, дом: *, квартира: *):");//Ввод адреса и проверка корректности
            in.nextLine();
            String adress = in.nextLine();
            Profile a = new Profile(name, surname, patronymic, date);
            if (a.checkAddress(adress)) {
                a.setAddress(adress);
            } else {
                System.out.println("Неверный адрес!\n");
                return;
            }

            System.out.println("Профиль: " + a.getName() + " " + a.getSurname() + " " + a.getPatronymic());
            System.out.println("Количество полных месяцев: " + a.quantityOfMonths());//использование методов для
            System.out.println("Количество полных лет: " + a.quantityOfYears());//месяца, года и короткого адреса
            System.out.println("Короткий адрес:\n" + a.shortAddressFormat());
        } catch (DateTimeParseException e) {
            System.out.println("Неверная дата!\n");
        }
    }
}
