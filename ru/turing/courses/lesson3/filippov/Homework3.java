package ru.turing.courses.lesson3.filippov;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] agr) {
        YandexTaxi user1 = new YandexTaxi("123", "890812313", 123213);
        YandexTaxi user2 = new YandexTaxi("1243", "890812313", 123213);
        YandexTaxi user3 = new YandexTaxi("12323", "890812333213", 123213);
        BanksRecords user4 = new BanksRecords("123", "890812313", true);
        BanksRecords user5 = new BanksRecords("1243", "890812313", true);
        BanksRecords user6 = new BanksRecords("12323", "890812333213", false);
        Registry<YandexTaxi> registry1 = new Registry<>();
        Registry<BanksRecords> registry2 = new Registry<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println(user1);
        int choice;
        do {
            System.out.println("Работать с YandexTaxi-1 , Bank - 2, end -3 ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registry1.view();
                    System.out.println("____________________________________________");
                    //добавление пользователей

                    registry1.add(user1.getId(), user1);
                    registry1.add(user2.getId(), user2);
                    registry1.add(user3.getId(), user3);

                    //просмотр мапы
                    registry1.view();
                    System.out.println("____________________________________________");

                    //удаление по ключу
                    registry1.removeByKey("1243");
                    registry1.view();

                    //добавили пользователя
                    registry1.add(user2.getId(), user2);
                    System.out.println("____________________________________________");

                    //удаление по значению
                    System.out.println("Список ключей удаленных пользователей" + registry1.removeByValue(user1));
                    registry1.view();

                    System.out.println("____________________________________________");

                    //clear
                    registry1.clear();

                    //getByKey(String key)
                    //добавили пользователей
                    registry1.add(user2.getId(), user2);
                    registry1.add(user1.getId(), user1);
                    registry1.add(user3.getId(), user3);
                    System.out.println("____________________________________________");
                    System.out.println(registry1.getByKey("1"));
                    System.out.println("____________________________________________");
                    System.out.println(registry1.getByKey("123"));

                    //getByName(String id)
                    System.out.println("____________________________________________");
                    System.out.println(registry1.getByName("890812313"));

                    //bank
                    break;
                case 2:
                    System.out.println("BANK");
                    registry2.view();
                    System.out.println("____________________________________________");
                    //добавление пользователей

                    registry2.add(user1.getId(), user4);
                    registry2.add(user2.getId(), user5);
                    registry2.add(user3.getId(), user6);

                    //просмотр мапы
                    registry2.view();
                    System.out.println("____________________________________________");

                    //удаление по ключу
                    registry2.removeByKey("1243");
                    registry2.view();

                    //добавили пользователя
                    registry2.add(user2.getId(), user5);
                    System.out.println("____________________________________________");

                    //удаление по значению
                    System.out.println("Список ключей удаленных пользователей" + registry2.removeByValue(user4));
                    registry2.view();

                    System.out.println("____________________________________________");

                    //clear
                    registry2.clear();

                    //getByKey(String key)
                    //добавили пользователей
                    registry2.add(user2.getId(), user4);
                    registry2.add(user1.getId(), user5);
                    registry2.add(user3.getId(), user6);
                    System.out.println("____________________________________________");
                    System.out.println(registry2.getByKey("1"));
                    System.out.println("____________________________________________");
                    System.out.println(registry2.getByKey("123"));

                    //getByName(String id)
                    System.out.println("____________________________________________");
                    System.out.println(registry2.getByName("890812313"));
                    break;
                default:
                    System.out.println("Вы вели что-то не то");
                    break;
            }
            System.out.println("___________________________________________________");
        } while (choice != 3);
    }
}
