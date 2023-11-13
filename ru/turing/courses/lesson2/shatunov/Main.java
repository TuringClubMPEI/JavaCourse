package ru.turing.courses.lesson2.shatunov;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше ФИО:");
        String fullName = in.nextLine();

        System.out.println("Введите дату рождения:");
        String[] birthDate = in.nextLine().split("\\.");

        System.out.println("Введите свой адресс:");
        String address = in.nextLine();

        System.out.println("\nПолных лет: " + countYearAge(birthDate));
        System.out.println("Полных месяцев: " + countMonthAge(birthDate));
        System.out.println("\n"+getShortAddress(address));
    }

    private static int countYearAge(String[] birthDate){
        return countMonthAge(birthDate) / 12;
    }

    private static int countMonthAge(String[] birthDate){
        Calendar cal = Calendar.getInstance();
        int birthDay = Integer.parseInt(birthDate[0]);
        int birthMonth = Integer.parseInt(birthDate[1]);
        int birthYear = Integer.parseInt(birthDate[2]);

        int currentDay = cal.get(Calendar.DAY_OF_MONTH);
        int currentMonth = cal.get(Calendar.MONTH)+1;
        int currentYear = cal.get(Calendar.YEAR);

        int result = (currentYear - birthYear) * 12;

        if (currentMonth > birthMonth){
            result += currentMonth - birthMonth - 1;
        }
        else if (currentMonth < birthMonth || currentDay < birthDay){
            result -= birthMonth - currentMonth + 1;
        }
        return result;
    }

    private static String getShortAddress(String longAddress){
        longAddress = longAddress.replace("страна: ", "");
        longAddress = longAddress.replace("город: ", "г. ");
        longAddress = longAddress.replace("улица: ", "ул. ");
        longAddress = longAddress.replace("дом: ", "д. ");
        longAddress = longAddress.replace("квартира: ", "кв. ");

        return longAddress.replace(", ", "\n");
    }
}
