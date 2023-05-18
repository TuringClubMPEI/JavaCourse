package ru.turing.courses.lesson1.Gasin.dateArrays;

import java.util.Scanner;

public class Solution {

    private static final int[] CURRENT_DATE_ARR = {11, 4, 2023};
    private static final int ADDRESS_PARTS_COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользовательских данных
        System.out.println("Введите ваше ФИО");
        String fio = scanner.nextLine();
        System.out.println("Введите дату рождения");
        String[] birthDateStringArr = scanner.nextLine().split("\\.");
        System.out.println("Введите адрес");
        String address = scanner.nextLine();

        // Вычисление полных лет и месяцев
        int[] birthDateArr = new int[3];
        for (int i = 0; i < 3; i++) {
            birthDateArr[i] = Integer.parseInt(birthDateStringArr[i]);
        }

        // Подсчет прожитых лет
        int years;
        if (birthDateArr[1] < CURRENT_DATE_ARR[1]
            || (birthDateArr[1] == CURRENT_DATE_ARR[1] && birthDateArr[2] <= CURRENT_DATE_ARR[2])) {
            // Если месяц и день текущий >= рождения, разница - разница в годах
            years = CURRENT_DATE_ARR[2] - birthDateArr[2];
        }
        else {
            // Если месяц и день текущий < рождения, разница - разница в годах минус 1
            years = CURRENT_DATE_ARR[2] - birthDateArr[2] - 1;
        }

        // Подсчет прожитых месяцев
        int months = (CURRENT_DATE_ARR[2] - birthDateArr[2]) * 12;
        if (birthDateArr[1] < CURRENT_DATE_ARR[1]) {
            // Если месяц и день текущий >= рождения, разница - годы x12 + месяца
            months += CURRENT_DATE_ARR[1] - birthDateArr[1];
        } else if (birthDateArr[1] == CURRENT_DATE_ARR[1]
            && birthDateArr[0] > CURRENT_DATE_ARR[0]) {
            // Если месяцы те же самые, смотрим по числу
            months--;
        } else if (birthDateArr[1] > CURRENT_DATE_ARR[1]) {
            months -= birthDateArr[1] - CURRENT_DATE_ARR[1];
            if (birthDateArr[0] > CURRENT_DATE_ARR[0]) {
                months--;
            }
        }

        System.out.println("Вы прожили " + years + " лет и " + months + " месяцев");

        // Форматирование адреса
        String[] addressPartsArr = address.split(", ");
        String[] formattedAddressParts = new String[ADDRESS_PARTS_COUNT];

        // Делаем из старого массива новый, выделяя подстроки и добавляя префиксы
        for (int i = 0; i < ADDRESS_PARTS_COUNT; i++) {
            switch (i) {
                case 0:
                    formattedAddressParts[i] = addressPartsArr[i].substring(8);
                    break;
                case 1:
                    formattedAddressParts[i] = "г. " + addressPartsArr[i].substring(7);
                    break;
                case 2:
                    formattedAddressParts[i] = "ул. " + addressPartsArr[i].substring(7);
                    break;
                case 3:
                    formattedAddressParts[i] = "д. " + addressPartsArr[i].substring(5);
                    break;
                case 4:
                    formattedAddressParts[i] = "кв. " + addressPartsArr[i].substring(10);
                    break;
                default:
                    System.out.println("Получена строка в неверном формате");
            }
        }
        for (String addressPart: formattedAddressParts) {
            System.out.println(addressPart);
        }
    }
}
