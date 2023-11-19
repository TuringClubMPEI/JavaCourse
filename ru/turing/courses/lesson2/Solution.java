package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Sparrow;
import ru.turing.courses.lesson2.animals.Wolf;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Person entity = new Person();
        String DataRegex = "dd.MM.yyyy";//шаблон даты
        String AdrRegex = "^страна: .+, город: .+, улица: .+, дом: \\d+, квартира: \\d+$";//шаблон адреса
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = in.next();
        System.out.print("Введите фамилию ");
        String surname = in.next();
        System.out.print("Введите отчество ");
        String secondName = in.next();
        entity.setFIO(surname, name, secondName);
        System.out.print("Введите дату рождения ");
        String date = in.next();
        while (!entity.setData(date, DataRegex)) {
            System.out.print("Введите дату рождения нормально ");
            date = in.next();
        }
        in.nextLine();
        System.out.print("Введите адрес ");
        String address = in.nextLine();
        while (!entity.setAdr(address, AdrRegex)) {
            in.nextLine();
            System.out.print("Введите адрес нормально ");
            address = in.nextLine();
        }
        System.out.print("количество полных лет, которые прожил: ");
        System.out.print(entity.getyears());
        System.out.print("\nколичество полных месяцев, которые прожил: ");
        System.out.print(entity.getMonth());
        System.out.print(entity.splitAddress());

        Wolf firstAminal = new Wolf();
        Sparrow secondAnimal = new Sparrow();

        firstAminal.eat();
        secondAnimal.eat();
        firstAminal.sleep();
        System.out.println("волк спит" + firstAminal.getAmountOfSleep() + " часов");
    }
}
