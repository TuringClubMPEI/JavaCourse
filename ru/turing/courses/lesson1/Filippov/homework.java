package ru.turing.courses.lesson1.Filippov;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

public class homework {

    private static boolean checkInputData(String str, String regex) {

        Pattern pattern = Pattern.compile(regex);

        //регулярка +-означает что этот символ должен попаться как минимум один раз а |-это "или"
        // я | добавил, чтобы обрабатывать двойные фамилии типо Филииппов-Соколовский

        Matcher match = pattern.matcher(str);//класс, чтобы сравнивать строку с шаблоном

        return match.matches();//вывод true если совпало, false если нет
    }

    private static String countAge(String data) {
        String[] dataSplit = data.split("\\.");//создаем массив из дня месяца и года
        int year;
        year = Integer.parseInt(dataSplit[2]);//переводим из типа стринг в тип инт
        int months = Integer.parseInt(dataSplit[1]);//аналогично
        String fullYears = "";
        if ((year == 2023) & (months > 4)) {
            fullYears = "Ошибка";
        } else {
            year = 2023 - year - 1;//считаем года
            months = 12 - months + 4;//+4 т.к. сейчас апрель ;)считаем месяцы
            if (months >= 12) {//проверка чтобы не писать 12 месяцев
                year++;
                months = months - 12;
            }
            //пусть я родился 20.03.2020, 4-ый месяц, я еще не прожил, поэтому 12-months+4
            fullYears = Integer.toString(year) + " лет(года) " + Integer.toString(months) + " месяцев(месяца)";


        }
        return fullYears;
    }

    public static void main(String[] args) {
        //Регулярные выражения
        //______________________________________________________________________________________________________
        String regexFIO = "(([А-Я][а-я]+)|([А-Я][а-я]+\\-[А-Я][а-я]+)) [А-Я][а-я]+(( [А-Я][а-я]+)|())";
        String regexData = "(([1,2][0-9])|(0[1-9])|(3[0,1]))\\.((0[1-9])|(1[0-2]))\\.((19[0-9][0-9])|(20[0,1][0-9])|(202[0-3]))";
        //\\d-любое число две черты, чтобы показать. что это метасимвол\\.-так пишется точка т.к. точка это метосимвол
        //не забывать про скобочки в регулярных выражениях
        String regexAddress = "страна: ?[А-я][а-я]+, ?город: ?[А-Я][а-я]+, ?улица: ?(([А-я][а-я]+)|([А-я][а-я]+ [А-я][а-я]+)), ?дом: ?\\d+, ?квартира: ?\\d+";
        //добавил ? , делает необязательным пробел между страна: Россияю, еще можно написать улицу, типо Проспект мира или Максима Горького
        //______________________________________________________________________________________________________

        Scanner scanner = new Scanner(System.in);//создание экхемпляра класса Scanner для ввода данных

        //работа с фамиелей
        System.out.print("Здравствуйте\nВведите ФИО(отчество,при наличии):");
        String FIO = scanner.nextLine();//ввод фамилии
        FIO = FIO.trim();//удалим последние и первые пробелы, простим пользователю такие ошибки
        while (!checkInputData(FIO, regexFIO)) {
            System.out.print("Похоже вы ошиблись, проверьте, чтобы фамилия,имя,отчество(если оно есть) начинались с большой буквы:");
            FIO = scanner.nextLine();//ввод фамилии
            FIO = FIO.trim();//удалим последние и первые пробелы, простим пользователю такие ошибки
        }

        //работа с датой
        System.out.print("Введите дату рождения в в формате xx.xx.xxxx:");
        String data = scanner.nextLine();
        String fullYear = countAge(data);

        while ((!checkInputData(data, regexData)) | fullYear == "Ошибка") {
            System.out.print("Похоже вы ошиблись, проверьте,чтобы дата была в формате xx.xx.xxxx, или ,Вы, вводите несуществующую дату:");
            data = scanner.nextLine();//ввод даты
            fullYear = countAge(data);
        }


        //работа с адресои
        System.out.print("Введите адресв формате(страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24):");
        String address = scanner.nextLine();
        while (!checkInputData(address, regexAddress)) {
            System.out.print("Похоже вы ошиблись, проверьте,чтобы адрес был в правильном формате(страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24):");
            address = scanner.nextLine();//ввод даты
        }

        String[] addressSplit = address.split("((: )|:|,)");//разделим либо ":", либо ",", либо ": "

        System.out.println("\n__________________________________________________________________________________________________________________\n");
        System.out.println(FIO + ", проживающий по адрессу:");
        System.out.println(addressSplit[1] + "\nг. " + addressSplit[3] + "\nул. " + addressSplit[5] + "\nд. " + addressSplit[7] + "\nкв. " + addressSplit[9]);
        System.out.println("Полных лет: " + fullYear);
        System.out.println("Рады вручить вам повестку");
        System.out.print("Если вы считатет, что повестку вам вручили по ошибке, \nобратитесь в Объединённый военный комиссариат Лефортовского района\n");
        System.out.println("или позвоните по номеру 8 (495) 177-54-10.\nНо лучше приходите) ");
        System.out.println("\n__________________________________________________________________________________________________________________\n");
    }

}


