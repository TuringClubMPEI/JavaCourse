package ru.turing.courses.lesson2;

import java.util.Arrays;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static final String countryRu = "страна";
    public static final String cityRu = "город";
    public static final String streetRu = "улица";
    public static final String houseRu = "дом";
    public static final String apartmentRu = "квартира";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свое ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите дату рождения (в формате дд.мм.гггг): ");
        String birthDateStr = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = null;

        try {
            birthDate = dateFormat.parse(birthDateStr);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Введите свой адрес одной строкой (в формате (в формате страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)): ");
        String fullAddress = scanner.nextLine();

        printName(fullName);
        calculateAge(birthDate);
        printShortAddress(fullAddress);
    }

    private static void printName(String name) {
        System.out.println(name);
    }

    private static void calculateAge(Date birthDate) {
        Calendar today = Calendar.getInstance();
        Calendar birthDay = Calendar.getInstance();
        birthDay.setTime(birthDate);

        int years = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        int months = today.get(Calendar.MONTH) - birthDay.get(Calendar.MONTH);
        int days = today.get(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH);

        if (days < 0) {
            months--;
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("Полных лет: " + years);
        System.out.println("Полных месяцев: " + months);
    }

    private static void printShortAddress(String fullAddress) {
        String[] addressParts = fullAddress.split(", ");

        for (String addressPart : addressParts) {
            String[] parts = addressPart.split(":");

            switch (parts[0]) {
                case countryRu:
                    System.out.println(parts[1].trim());
                    break;
                case cityRu:
                    System.out.println("г. " + parts[1].trim());
                    break;
                case streetRu:
                    System.out.println("ул. " + parts[1].trim());
                    break;
                case houseRu:
                    System.out.println("д. " + parts[1].trim());
                    break;
                case apartmentRu:
                    System.out.println("кв. " + parts[1].trim());
                    break;
            }
        }
    }
}
