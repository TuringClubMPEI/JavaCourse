package ru.turing.courses.lesson2.Filippov.studing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {

        //Регулярные выражения
        String regexFio = "(([А-Я][а-я]+)|([А-Я][а-я]+\\-[А-Я][а-я]+)) [А-Я][а-я]+(( [А-Я][а-я]+)|())";
        String regexDate = "(([1,2][0-9])|(0[1-9])|(3[0,1]))\\.((0[1-9])|(1[0-2]))\\.((19[0-9][0-9])|(20[0,1][0-9])|(202[0-3]))";
        //\\d-любое число две черты, чтобы показать. что это метасимвол\\.-так пишется точка т.к. точка это метосимвол
        //не забывать про скобочки в регулярных выражениях
        String regexAddress = "страна: ?[А-я][а-я]+, ?город: ?[А-Я][а-я]+, ?улица: ?(([А-я][а-я]+)|([А-я][а-я]+ [А-я][а-я]+)), ?дом: ?\\d+, ?квартира: ?\\d+";
        //добавил ? , делает необязательным пробел между страна: Россияю, еще можно написать улицу, типо Проспект мира или Максима Горького

        Scanner scanner = new Scanner(System.in);//создание экхемпляра класса Scanner для ввода данных
        //регулярка +-означает что этот символ должен попаться как минимум один раз а |-это "или"
        // я | добавил, чтобы обрабатывать двойные фамилии типо Филииппов-Соколовский
        //работа с ФИО
        UserProcessor processor = new UserProcessor();


        System.out.print("Здравствуйте\nВведите ФИО(отчество,при наличии):");
        String fio = scanner.nextLine();//ввод фамилии
        fio = fio.trim();//удалим последние и первые пробелы, простим пользователю такие ошибки
        Pattern pattern = Pattern.compile(regexFio);
        Matcher match = pattern.matcher(fio);
        while (!match.matches()) {
            System.out.print("Похоже вы ошиблись, проверьте, чтобы фамилия,имя,отчество(если оно есть) начинались с большой буквы:");
            fio = scanner.nextLine();//ввод фамилии
            fio = fio.trim();//удалим последние и первые пробелы, простим пользователю такие ошибки
            match = pattern.matcher(fio);
        }

        //работа с датой
        System.out.print("Введите дату рождения в в формате xx.xx.xxxx:");
        String date = scanner.nextLine();
        pattern = Pattern.compile(regexDate);
        match = pattern.matcher(date);
        while (!match.matches() || processor.getCountYear(date) == "Ошибка") {
            System.out.print("Похоже вы ошиблись, проверьте,чтобы дата была в формате xx.xx.xxxx, или ,Вы, вводите несуществующую дату:");
            date = scanner.nextLine();//ввод даты
            match = pattern.matcher(date);
        }

        //работа с адресом
        System.out.print("Введите адресв формате(страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24):");
        String address = scanner.nextLine();
        pattern = Pattern.compile(regexAddress);
        match = pattern.matcher(address);
        while (!match.matches()) {
            System.out.print("Похоже вы ошиблись, проверьте,чтобы адрес был в правильном формате(страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24):");
            address = scanner.nextLine();//ввод даты
            match = pattern.matcher(address);
        }
        processor.getShortAddress(address);
        System.out.println("\nПервая реализация");
        Student youngMan = new Student(fio);
        Pupil teenager = new Pupil(fio);

        System.out.println(youngMan.getName());
        youngMan.study();
        youngMan.passExam();
        for (int i = 0; i < 3; i++) {
            youngMan.study();
        }
        youngMan.passExam();

        System.out.println();

        System.out.println(teenager.getName());
        teenager.study();
        teenager.passExam();
        System.out.println();
        System.out.println("\n__________________________________________________________________________________________________________________\n");
        System.out.println(fio + ", проживающий по адрессу:");
        System.out.println(processor.getShortAddress(address));
        System.out.printf("Полных лет: %s %s", processor.getCountYear(date), processor.getCountMonths(date));
        System.out.println("\nРады вручить вам повестку");
        System.out.print("Если вы считатет, что повестку вам вручили по ошибке, \nобратитесь в Объединённый военный комиссариат Лефортовского района\n");
        System.out.println("или позвоните по номеру 8 (495) 177-54-10.\nНо лучше приходите) ");
        System.out.println("\n__________________________________________________________________________________________________________________\n");
    }


}


