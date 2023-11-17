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
        Mouse mouse = new Mouse("Мышыч", "серая", "basic", 10, 4, "Бри", "8");
        mouse.sleep(mouse.getHoursOfSleep());
        mouse.krodetsya();
        mouse.eat(mouse.getFavoriteTypeOfCheese());

        Cat cat = new Cat("Барсик", "Коричневый", "Британский", 5, 4, "10", "Whiskas");
        cat.play(cat.getPlayWithLaser());
        cat.eat(cat.getFavoriteTypeOfFeed());
        cat.cheel();

        //подключаю библиотеку и создаю переменную с текущим годом
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        //ввод фио пользователя
        System.out.println("Введите свое ФИО: ");
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();

        //ввод даты
        System.out.println("Введите свою дату рождеиня в формате дд.мм.гггг: ");
        String date = scan.nextLine();
        //создаю массив типа чар и начиная с 6 символа массива беру 4 символа года, преобразую в тип int и записываю в переменную year
        char[] dateArray = date.toCharArray();
        int year = Integer.valueOf(String.valueOf(dateArray, 6, 4));

        //ввод пользователем адресса
        System.out.println("Введите свой адресс одной строкой (Пример - страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24)");
        //создаю символ который в дальнейшем буду удалаять из нужной мне перепенной
        char charToRemove = ',';

        //для каждой переменной создаю переменну-буфер, в которой хранится страна:, город: и т.п.
        String stranaBuffer = scan.next();
        String strana = scan.next();
        //удаляю запятую. Без этой строчки вывод переменной strana выглядел бы так -> Россия,
        strana = strana.replace(String.valueOf(charToRemove), "");

        //Повторяю те же действия для каждой составляющей адресса
        String gorodBuffer = scan.next();
        String gorod = scan.next();
        gorod = gorod.replace(String.valueOf(charToRemove), "");

        String ulicaBuffer = scan.next();
        String ulica = scan.next();
        ulica = ulica.replace(String.valueOf(charToRemove), "");

        String domBuffer = scan.next();
        String dom = scan.next();
        dom = dom.replace(String.valueOf(charToRemove), "");

        String kvartiraBuffer = scan.next();
        String kvartira = scan.next();
        kvartira = kvartira.replace(String.valueOf(charToRemove), "");

        //считаю количество полных лет и месяцев пользователя

        System.out.println("Количество полных лет ползователя: " + countAge(currentYear, year));


        System.out.println("Количество полных месяцев ползователя: " + countMonth(countAge(currentYear, year)));

        //вызываю функцию перевода адресса
        shorAdressFormat(strana, gorod, ulica, dom, kvartira);


    }

    public static void shorAdressFormat(String strana, String gorod, String ulica, String dom, String kvartira) {
        System.out.println(strana);
        System.out.println("г." + gorod);
        System.out.println("ул." + ulica);
        System.out.println("д." + dom);
        System.out.println("кв." + kvartira);
    }

    public static int countAge(int currentYear, int year) {
        int ageOfUser = currentYear - year;
        return ageOfUser;
    }

    public static int countMonth(int ageOfUser) {
        int monthOfUser = ageOfUser * 12;
        return monthOfUser;
    }
}
