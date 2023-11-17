package ru.turing.courses.lesson2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        baza Person = new baza();
        String DataRegex = "dd.MM.yyyy";//шаблон даты
        String AdrRegex = "^страна: .+, город: .+, улица: .+, дом: \\d+, квартира: \\d+$";//шаблон адреса
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя ");
        String im = in.next();
        System.out.print("Введите фамилию ");
        String fam = in.next();
        System.out.print("Введите отчество ");
        String otch = in.next();
        Person.setFIO(fam, im, otch);
        System.out.print("Введите дату рождения ");
        String date = in.next();
        while (!Person.setData(date, DataRegex)){
            System.out.print("Введите дату рождения нормально ");
            date = in.next();
        }
        in.nextLine();
        System.out.print("Введите адрес ");
        String adr = in.nextLine();
        while (!Person.setAdr(adr, AdrRegex)) {
            in.nextLine();
            System.out.print("Введите адрес нормально ");
            adr = in.nextLine();
        }
        System.out.print("количество полных лет, которые прожил: ");
        System.out.print(Person.getyears());
        System.out.print("\nколичество полных месяцев, которые прожил: ");
        System.out.print(Person.getmonth());
        System.out.print(Person.razd());
    }
}
