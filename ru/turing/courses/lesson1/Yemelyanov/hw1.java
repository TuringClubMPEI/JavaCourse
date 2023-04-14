package ru.turing.courses.lesson1.Yemelyanov;

import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;


public class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши данные (ФИО), дату рождения: ");

//Ввод ФИО и возраст
        String fio = input.nextLine();
        String dateOfBirth = input.nextLine();
        String[] date;
        date = dateOfBirth.split("\\.");

        System.out.print("Введите адрес: ");
        String adressParts = input.nextLine();
        String[] ad;
        ad = adressParts.split(", ");
//Может я тупой просто, но, видимо, тут пословно происходит замена в массиве строк
        ad[0] = ad[0].replace("страна:", "");
        ad[1] = ad[1].replace("город:", "г.");
        ad[2] = ad[2].replace("улица:", "ул.");
        ad[3] = ad[3].replace("дом:", "д.");
        ad[4] = ad[4].replace("квартира:", "кв.");

        int day = Integer.parseInt(date[0]); //Приведение строки к числу - день
        int mon = Integer.parseInt(date[1]); //Приведение строки к числу - месяц
        int year = Integer.parseInt(date[2]); //Приведение строки к числу - год

//Домашку я сел писать 08.04.2023 - от этой даты отталкиваются мои расчеты, так как делать дополнительный ввод и проверку мне было лень))
//Рассчет возраста и кол-ва прожитых месяцев - с помощью оператора ветвления производится сравнение, совпадают ли месяц и день с введенными : если нет, возраст уменьшается на 1, и количество месяцов тоже

        final int currentDay = 8;
        final int currentMon = 4;
        final int currentYear = 2023;

        int age = currentYear - year;
        if (day > currentDay && mon > currentMon) {
            if (age != 0) {
                age--;
            }
        }
        int ageMon = 0;
        if (year < currentYear) {
            ageMon = age * 12 + currentMon + (12 - mon);
            if (mon == currentMon) {
                ageMon = age * 12;
                if (day > currentDay) {
                    ageMon = age * 12 - 1;
                }
            }
            if (day > currentDay) {
                ageMon--;
            }
        } else if (year == currentYear) {
            ageMon = age * 12 + currentMon;
            if (day < currentDay) {
                ageMon--;
            }
        }

        System.out.println("=========== ИНФОКАРТОЧКА О ГРАЖДАНИНЕ ============");
        System.out.println("Текущий возраст: " + age);
        System.out.println("Кол-во прожитых месяцев: " + ageMon);

        for (String adr : ad) { //Вывод адреса с новой строчки
            System.out.println(adr);
        }
    }
}

