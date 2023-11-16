package ru.turing.courses.lesson1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //todo написать код здесь
        Scanner sc = new Scanner(System.in);
        //ФИО
        System.out.println("Введите свое ФИО");
        System.out.println("Имя: ");
        String name = sc.nextLine();
        System.out.println("Фамилия: ");
        String surname = sc.nextLine();
        System.out.println("Отчество(Пропустите, если отсутствует): ");
        String patronymic = sc.nextLine();

        //дата рождения
        System.out.println("Ведите дату рождения в формате дд.мм.гггг");
        String birth = sc.nextLine();
        String[] dates = birth.split("\\.");
        int day = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);

        //адрес
        System.out.println("Введите свой адрес через пробел в формате: '_Страна_ г._город_ _улица_ д._дом_ кв._квартира_'");
        System.out.println("В названиии улицы написать в начале ул./пр-кт и т.п.");
        System.out.println("Если в названии страны/города/улицы нескольк слов - разделите их нижним подчеркиванием");
        String adress = sc.nextLine();
        String[] params = adress.split(" ");
        int years;
        if (month < 12 & day <=15) {
            years = 2023 - Integer.parseInt(dates[2]);
        }
        else {
            years = 2022 - Integer.parseInt(dates[2]);
        }

        System.out.println("Кол-во полных лет пользователя:" + years);
        System.out.println("Кол-во прожитых месяцев:" + years*12);

        System.out.println("Адрес проживания пользователя: ");
        for (String param: params)
            System.out.println(param);
    }
}
