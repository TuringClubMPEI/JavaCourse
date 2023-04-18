package ru.turing.courses.lesson2.Yemelyanov;


import ru.turing.courses.lesson2.animals.ExcelentStudent;
import ru.turing.courses.lesson2.animals.VovaSidorov;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите дату рождения персонажа: ");
        Scanner input = new Scanner(System.in);

        String inputDate = input.nextLine();
        System.out.println("Введите адрес в формате: (страна: -, город: -, улица: -, дом: -, квартира: -.)");

        String adressByFormat = input.nextLine(); //Ввод адреса по формату
        DateTimeFormatter validDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //Конвертация введенной даты по формату

        LocalDate birthDay = LocalDate.parse(inputDate, validDateFormat); //День рожжения по формату
        Person person = new Person(birthDay, adressByFormat);

        UserProcessor personInfo = new UserProcessor();
        int age = personInfo.getAge(person, 1); //Вызов метода с параметром для расчета прожитых лет
        int ageMon = age * 12 + personInfo.getAge(person, 0); //Вызов метода с параметром для расчета прожитых месяцев
        String[] adressParts = new String[5]; //Инициализацяи массива строк для заполнения полей адреса
        personInfo.convertAdress(person, adressParts); //Парсинг адреса

        System.out.println("====================ИНФОКАРТОЧКА О ГРАЖДАНИНЕ======================");
        System.out.println("На текущий момент вы прожили " + age +
                " лет. Это эквивалентно " + ageMon + " полных месяцев");
        System.out.println("Адрес: ");
        personInfo.showAdress(adressParts);

        ////////////////////////////////////////////////////

        Animal cat = new Cat("Кошачий", 5, "рыжий");
        Animal Gorshok = new MichailGorshenev("Михаил Горшенев", "Хомосапиенс", 18, "брюнет");


        System.out.println("Кот: ");
        System.out.print("Класс: ");
        cat.classifyAnimal();
        System.out.print("Что говорит: ");
        cat.getSound();
        System.out.print("Цвет: ");
        System.out.println(cat.color);
        cat.getPenisLength();
        cat.sayAlive();
                                                                //Это все тест наследников класса Animal
        System.out.println("Горшок: ");
        System.out.print("Класс: ");
        Gorshok.classifyAnimal();
        System.out.print("Что говорит: ");
        Gorshok.getSound();
        System.out.print("Цвет: ");
        System.out.println(Gorshok.color);
        Gorshok.getPenisLength();
        Gorshok.sayAlive();

        ////////////////////////////////////////////////

        Studying firstStudent = new ExcelentStudent();
        Studying secondStudent = new VovaSidorov();
                                                            //Тест реализации интерфейсов
        firstStudent.study();
        firstStudent.passExam(true);
        secondStudent.study();
        secondStudent.passExam(false);

    }

}
