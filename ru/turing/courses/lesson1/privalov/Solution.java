package ru.turing.courses.lesson1.privalov;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Просим ввести ФИО, считываем из консоли
        System.out.println("Введите своё ФИО");
        String name = scanner.nextLine();

        //Просим ввести и считываем дату рождения
        System.out.println("Введите свою дату рождения (в формате дд.мм.гггг)");
        String birthDate = scanner.nextLine();

        //Создаем массив с числами из даты рождения
        String[] stringBirthDates = birthDate.split("\\.");

        //Выгружаем системную дату, переводим её в массив
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String stringDate = formatter.format(date);
        String[] stringCurrentDate = stringDate.split("\\.");

        //Переводим оба массива к типу integer для удобства работы
        int[] birthDates = new int[3];
        int[] currentDates = new int[3];
        for (int i = 0; i < 3; i++) {
            birthDates[i] = Integer.parseInt(stringBirthDates[i]);
            currentDates[i] = Integer.parseInt(stringCurrentDate[i]);
        }

        //Инициализируем переменные полных прожитых лет и месяцев
        int wholeYears;
        int wholeMonths;

        //Проводим подсчёт лет и месяцев с помощью условий: важно, месяц нынешний > или < месяца рождения и то же с днем.
        if (currentDates[1] > birthDates[1]) {
            if (currentDates[0] >= birthDates[0]) {
                wholeYears = currentDates[2] - birthDates[2];
                wholeMonths = currentDates[1] - birthDates[1] + wholeYears * 12;
            } else {
                wholeYears = currentDates[2] - birthDates[2];
                wholeMonths = currentDates[1] - birthDates[1] - 1 + wholeYears * 12;
            }
        } else {
            if (currentDates[0] >= birthDates[0]) {
                wholeYears = currentDates[2] - birthDates[2] - 1;
                wholeMonths = 12 - birthDates[1] + currentDates[1] + wholeYears * 12;
            } else {
                wholeYears = currentDates[2] - birthDates[2] - 1;
                wholeMonths = wholeYears * 12 + 12 - birthDates[1] + currentDates[1] - 1;
            }
        }

        //Выводим ответ на вопрос
        System.out.println("Вы прожили " + wholeYears + " полных лет и " + wholeMonths + " полных месяцев.");

        System.out.println("Введите свой адрес одной строкой (в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24')");
        String address = scanner.nextLine(); //считываем адрес из консоли
        String[] shortAddress = address.split(",?\\s?[а-я]+:\\s?"); //создаем массив из нужных впоследствии данных об адресе,
        //разделяя строку address сплитом с использованием маски: не нужные нам части "сырой" строки (например, ", город:") определяем паттерном:
        //не более одного вхождения запятой в начале, не более одного вхождения пробела после, несколько букв (слово), окончание на двоеточие и пробел

        String[] prefixes = {"", "", "г. ", "ул. ", "д. ", "кв. "}; //по заданию всё кроме страны требуется вывести с сокращенными словами по типу "ул. ".
        //Так как сплит строки адреса дал в массиве shortAddress пустой первый элемент, а страна выводится без дополнительных слов,
        // то первые два элемента в массиве префиксов пустые. Дальше слова идут в соответствии с информацией

        for (int i = 1; i <= 5; i++) { //выводим с первого элемента массивов (так как нулевые элементы пустые) префикс и нужную часть адреса
            System.out.println(prefixes[i] + shortAddress[i]);
        }
    }
}
