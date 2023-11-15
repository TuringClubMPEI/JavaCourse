package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Animal;
import ru.turing.courses.lesson2.animals.Dog;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
    }
    public class User {
        private String address;
        private int day, month, year;

        public void setAddress() {
            System.out.println("Введите свой адрес через пробел в формате: '_Страна_ г._город_ ул._улица_ д._дом_ кв._квартира_'");
            System.out.println("Если в названии страны/города/улицы нескольк слов - разделите их НИЖНИМ ПОДЧЁРКИВАНИЕМ");
            System.out.println("Пример: ул. дмитровское_шоссе");
            Scanner sc = new Scanner(System.in);
            String address = sc.nextLine();
            String[] params = address.split(" ");


            System.out.println("Адрес проживания пользователя: ");
            for (String param: params)
                System.out.println(param);
        }

        public void setBirth() {
            System.out.println("Ведите дату рождения (в формате дд.мм.гггг)");
            Scanner in = new Scanner(System.in);
            parseBirth(in.nextLine());
        }

        private void parseBirth(String birth) {
            String[] dates = birth.split("\\."); // мне это idea предложила вместо "." , не знаю почему
            day = Integer.parseInt(dates[0]);
            month = Integer.parseInt(dates[1]);
            year = Integer.parseInt(dates[2]);

            int years;
            if (month < 12 & day <= 15) {
                years = 2023 - Integer.parseInt(dates[2]);
            }
            else {
                years = 2022 - Integer.parseInt(dates[2]);
            }

            System.out.println("Кол-во полных лет пользователя: " + years);
            System.out.println("Кол-во прожитых месяцев: " + years*12);

        }

    }
}
