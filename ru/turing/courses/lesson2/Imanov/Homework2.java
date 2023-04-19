package ru.turing.courses.lesson2.Imanov ;

import java.util.Scanner;

import ru.turing.courses.lesson2.Imanov.Animal.Gender;
import ru.turing.courses.lesson2.Imanov.Animal.Lama;
import ru.turing.courses.lesson2.Imanov.Animal.Cat;

import static ru.turing.courses.lesson2.Imanov.UserProcessor.UserProcessor.userInformation;
import static ru.turing.courses.lesson2.Imanov.UserProcessor.UserProcessorTest.testExamplesPassed;


public class Homework2 {
    public static void main(String[] args) {

        // проверка работоспособности equals
        Cat firstCat = new Cat("Муся", 4, Gender.FEMALE, 50, true);
        Cat secondCat = new Cat("Муся", 4, Gender.FEMALE, 50, true);
        Cat thirdCat = new Cat("Владислав Мирный", 72, Gender.FEMALE, 40, false);
        Lama lama = new Lama("Игорь", 12, Gender.HELICOPTER, 20, false);

        System.out.println("сравнение первой и второй кошки: " + firstCat.equals(secondCat)); // true
        System.out.println("сравнение первой и третьей кошки: " + firstCat.equals(thirdCat)); // false
        System.out.println("сравнение кошки с ламой: " + firstCat.equals(lama)); // false;

        // проверка работоспособности UserProcessor
        if (testExamplesPassed()) {
            // запрос и ввод данных
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ФИО: ");
            String fio = scanner.nextLine();
            System.out.print("Введите дату рождения в формате дд.мм.гггг: ");
            String birthday = scanner.nextLine();
            System.out.print("Введите адрес проживания в формате" +
                    " страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24: ");
            String userAddress = scanner.nextLine();

            userInformation(fio, birthday, userAddress); // запуск решения с заданными данными
        } else {
            System.out.println("кто-то не умеет писать код"); // :(
        }
    }
}
