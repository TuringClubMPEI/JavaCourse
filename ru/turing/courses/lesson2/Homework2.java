package ru.turing.courses.lesson2;


import ru.turing.courses.lesson2.animals.Animal;
import ru.turing.courses.lesson2.animals.Cat;
import ru.turing.courses.lesson2.animals.Mouse;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        //Животные
        Mouse mouse = new Mouse("Мышыч", "серая", "basic", 10, 4, "Бри", "8", 2);
        mouse.sleep(mouse.getIntHoursOfsleep());
        mouse.krodetsya();
        mouse.eat(mouse.getFavoriteTypeOfCheese());

        Cat cat = new Cat("Барсик", "Коричневый", "Британский", 5, 4, "10", "Whiskas");
        cat.play(cat.getPlayWithLaser());
        cat.eat(cat.getFavoriteTypeOfFeed());
        cat.cheel();

        //ввод фио пользователя
        System.out.println("Введите свое ФИО: ");
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();

        //считаю количество полных лет и месяцев пользователя
        int age = countAge();

        System.out.println("Количество полных лет ползователя: " + age);
        System.out.println("Количество полных месяцев ползователя: " + countMonth(age));

        //вызываю функцию перевода адресса
        shorAdressFormat();
    }

    public static int countAge() {
        //подключаю библиотеку и создаю переменную с текущим годом
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        Scanner scan = new Scanner(System.in);
        //ввод даты
        System.out.println("Введите свою дату рождеиня в формате дд.мм.гггг: ");
        String date = scan.nextLine();
        //создаю массив типа чар и начиная с 6 символа массива беру 4 символа года, преобразую в тип int и записываю в переменную year
        char[] dateArray = date.toCharArray();
        int year = Integer.valueOf(String.valueOf(dateArray, 6, 4));

        int ageOfUser = currentYear - year;
        return ageOfUser;
    }

    public static int countMonth(int ageOfUser) {
        int monthOfUser = ageOfUser * 12;
        return monthOfUser;
    }

    public static void shorAdressFormat() {
        Scanner scan = new Scanner(System.in);

        //ввод пользователем адресса
        System.out.println("Введите свой адресс одной строкой (Пример - страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)");
        //создаю символ который в дальнейшем буду удалаять из нужной мне перепенной
        char charToRemove = ',';

        //для каждой переменной создаю переменну-буфер, в которой хранится страна:, город: и т.п.
        String countryBuffer = scan.next();
        String country = scan.next();
        //удаляю запятую. Без этой строчки вывод переменной country выглядел бы так -> Россия,
        country = country.replace(String.valueOf(charToRemove), "");

        //Повторяю те же действия для каждой составляющей адресса
        String cityBuffer = scan.next();
        String city = scan.next();
        city = city.replace(String.valueOf(charToRemove), "");

        String streetBuffer = scan.next();
        String street = scan.next();
        street = street.replace(String.valueOf(charToRemove), "");

        String houseBuffer = scan.next();
        String house = scan.next();
        house = house.replace(String.valueOf(charToRemove), "");

        String apartmentBuffer = scan.next();
        String apartment = scan.next();
        apartment = apartment.replace(String.valueOf(charToRemove), "");

        System.out.println(country);
        System.out.println("г." + city);
        System.out.println("ул." + street);
        System.out.println("д." + house);
        System.out.println("кв." + apartment);
    }

}
