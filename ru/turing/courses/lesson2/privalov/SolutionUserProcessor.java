package ru.turing.courses.lesson2.privalov;

import java.util.Scanner;

public class SolutionUserProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой адрес одной строкой (в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24')");
        String address = scanner.nextLine(); //считываем адрес из консоли
        UserProcessor.shortenAddress(address); //применяем метод из прописанного класса

        System.out.println("Введите свою дату рождения (в формате дд.мм.гггг)");
        String birthDate = scanner.nextLine();

        System.out.println("Вы прожили " + UserProcessor.calculateWholeYears(birthDate) + " полных лет");
        System.out.println("Вы прожили " + UserProcessor.calculateWholeMonths(birthDate) + " полных месяцев");
    }
}
