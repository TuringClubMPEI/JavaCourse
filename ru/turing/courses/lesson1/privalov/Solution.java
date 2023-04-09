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
        String bd = scanner.nextLine();

        //Создаем массив с числами из даты рождения
        String[] str_b_dates = bd.split("\\.");

        //Выгружаем системную дату, переводим её в массив
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String str_date = formatter.format(date);
        String[] str_current_dates = str_date.split("\\.");

        //Переводим оба массива к типу integer для удобства работы
        int[] b_day = new int[3];
        int[] cur_dates = new int[3];
        for (int i = 0; i < 3; i++) {
            b_day[i]=Integer.parseInt(str_b_dates[i]);
            cur_dates[i]=Integer.parseInt(str_current_dates[i]);
        }

        //Инициализируем переменные полных прожитых лет и месяцев
        int whole_years;
        int whole_months;

        //Проводим подсчёт лет и месяцев с помощью условий: важно, месяц нынешний > или < месяца рождения и то же с днем.
        if (cur_dates[1]>b_day[1]) {
            if (cur_dates[0]>=b_day[0]) {
                whole_years = cur_dates[2] - b_day[2];
                whole_months = cur_dates[1] - b_day[1] + whole_years * 12;
            } else {
                whole_years = cur_dates[2]-b_day[2];
                whole_months = cur_dates[1]-b_day[1]-1+whole_years*12;
            }
        } else {
            if (cur_dates[0]>=b_day[0]) {
                whole_years = cur_dates[2]-b_day[2]-1;
                whole_months = 12-b_day[1]+cur_dates[1]+whole_years*12;
            } else {
                whole_years = cur_dates[2]-b_day[2]-1;
                whole_months = whole_years*12+12-b_day[1]+cur_dates[1]-1;
            }
        }

        //Выводим ответ на вопрос
        System.out.println("Вы прожили " + whole_years + " полных лет и " + whole_months + " полных месяцев.");

        System.out.println("Введите свой адрес одной строкой (в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24')");
        String address = scanner.nextLine(); //считываем адрес из консоли
        String[] short_address = address.split(",?\\s?[а-я]+:\\s?"); //создаем массив из нужных впоследствии данных об адресе,
        //разделяя строку address сплитом с использованием маски: не нужные нам части "сырой" строки (например, ", город:") определяем паттерном:
        //не более одного вхождения запятой в начале, не более одного вхождения пробела после, несколько букв (слово), окончание на двоеточие и пробел

        String[] prefixes = {"", "", "г. ", "ул. ", "д. ", "кв. "}; //по заданию всё кроме страны требуется вывести с сокращенными словами по типу "ул. ".
        //Так как сплит строки адреса дал в массиве short_address пустой первый элемент, а страна выводится без дополнительных слов,
        // то первые два элемента в массиве префиксов пустые. Дальше слова идут в соответствии с информацией

        for (int i = 1; i <= 5; i++) { //выводим с первого элемента массивов (так как нулевые элементы пустые) префикс и нужную часть адреса
            System.out.println(prefixes[i]+short_address[i]);
        }
    }
}
