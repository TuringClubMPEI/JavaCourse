package ru.turing.courses.lesson2;

import ru.turing.courses.lesson2.animals.Cat;
import ru.turing.courses.lesson2.animals.Person;
import ru.turing.courses.lesson2.animals.Snail;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Person oleg = new Person();
        String name, surname, secondName; //ФИО человека
        String birthday; //Его дата рождения(String, потому что считываем её и переводим в LocalDate)
        String dateFormat = "dd.MM.yyyy"; //формат, которому должна соответствовать строка birthday
        String dateDelimiterRegex = ":.+?,$?"; //регулярное выражение для выделения из строки address страны, города и тд
        String address; //адрес проживания
        String addressRegex = "^страна: .+, город: .+, улица: .+, дом: \\d{2}, квартира: \\d{2}$"; //регулярное выражение, которому должна соответствовать строка address
        Cat barsik = new Cat("Дворовый", 9); //определим кота нашего человека
        Snail jora = new Snail("Тёмно-серый", 4); //и улитку нашего человека
        Scanner in = new Scanner(System.in);
        System.out.println("Введите по отдельности фамилию, имя и отчество:");
        name = in.next();
        surname = in.next();
        secondName = in.next();
        oleg.setFIO(name, surname, secondName);
        do {
            System.out.println("Введите дату рождения в формате ДД.ММ.ГГГГ:");
            birthday = in.next();
        } while (!oleg.setBirthday(birthday, dateFormat));
        in.nextLine();//этот метод считывает перенос строки предыдущего ввода, чтобы не пропускать 1-ую итерацию цикла, идущего сразу после in.nextLine();
        do {
            System.out.print("Введите адрес:");
            address = in.nextLine();//"страна: .+, город: .+, улица: .+, дом: 22, квартира: 22"
        } while (!(oleg.setAddres(address, addressRegex)));
        System.out.println("Вы ввели человека с ФИО: " + oleg.getName() + " " + oleg.getSurname()
                + " " + oleg.getSecondName() + ".");
        System.out.println("Дата рождения: " + oleg.getBirthday(dateFormat));
        System.out.println("Адрес проживания: ");
        oleg.printShortAddress(dateDelimiterRegex);
        System.out.println("Человек прожил полных:");
        System.out.println(oleg.getFullYears() + " лет,");
        System.out.println(oleg.getFullMonths() + " месяцев.");
        System.out.println("У этого человека есть домашние животные:");
        System.out.println("Кот, который любит есть " + barsik.getFoodType()
                + " и при этом издаёт звуки ");
        barsik.makeSounds();
        System.out.println("Улитка, которая любит есть " + jora.getFoodType()
                + " и при этом издаёт звуки ");
        jora.makeSounds();
    }
}
