package ru.turing.courses.lesson2.Yemelyanov;


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

        String[] adressParts = personInfo.convertAdress(person); //Парсинг адреса

        System.out.println("====================ИНФОКАРТОЧКА О ГРАЖДАНИНЕ======================");
        personInfo.printAge(person); //Вызов метода с параметром для расчета прожитых лет и месяцев
        System.out.println("Адрес: ");
        personInfo.showAdress(adressParts);

        ////////////////////////////////////////////////////

        Animal cat = new Cat("Кошачий", 5, "рыжий");
        Animal gorshok = new Rocker("Михаил Горшенев", "Хомосапиенс", 18, "брюнет");


        System.out.println("Кот: ");
        System.out.print("Класс: ");
        cat.classify();
        System.out.print("Что говорит: ");
        cat.makeSound();
        System.out.print("Цвет: ");
        System.out.println(cat.getColor());
        cat.printPenisLength();
        cat.sayAlive();
                                                                //Это все тест наследников класса Animal
        System.out.println("Горшок: ");
        System.out.print("Класс: ");
        gorshok.classify();
        System.out.print("Что говорит: ");
        gorshok.makeSound();
        System.out.print("Цвет: ");
        System.out.println(gorshok.getColor());
        gorshok.printPenisLength();
        gorshok.sayAlive();

        ////////////////////////////////////////////////

        Studying firstStudent = new ExcelentStudent();
        Studying secondStudent = new BadStudent();
                                                            //Тест реализации интерфейсов
        firstStudent.study();
        firstStudent.passExam(true);
        secondStudent.study();
        secondStudent.passExam(false);

    }

}
