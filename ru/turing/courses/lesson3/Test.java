package ru.turing.courses.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ru.turing.courses.lesson2.Person;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Registry<Person> instance = new Registry();
        Person entityFirst = new Person();
        Person entity = new Person();
        String DataRegex = "dd.MM.yyyy";//шаблон даты
        System.out.print("Введите имя ");
        String name = in.next();
        System.out.print("Введите фамилию ");
        String surname = in.next();
        System.out.print("Введите отчество ");
        String secondName = in.next();
        entityFirst.setFIO(surname, name, secondName);
        instance.add(1, entityFirst);
        System.out.print("Введите имя ");
        name = in.next();
        System.out.print("Введите фамилию ");
        surname = in.next();
        System.out.print("Введите отчество ");
        secondName = in.next();
        entity.setFIO(surname, name, secondName);
        instance.add(2, entity);
        instance.add(3, entity);
        System.out.println(instance.getSize());
        System.out.println("поиск по имени Ярослав:");
        List<Person> names = instance.getByName("Ярослав");
        for(Person value:names) {
            System.out.println(value.getName() + " " + value.getSecondName() + " " + value.getSurname());
        }
        System.out.println("поиск по первому ключу:");
        entity=instance.getByKey(1);
        System.out.println(entity.getName() + " "+ entity.getSecondName() + " "+ entity.getSurname());
        System.out.print("Удаление по второму значению.");
        entity=instance.getByKey(2);
        List<Integer> keys = instance.removeByValue(entity);
        System.out.println("Удаленные ключи:");
        for(Integer key:keys)
            System.out.print(key+" ");
        System.out.println();
        System.out.println("Размер реестра равен "+instance.getSize());
    }
}