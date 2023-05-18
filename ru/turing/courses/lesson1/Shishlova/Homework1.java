package ru.turing.courses.lesson1.Shishlova;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
// создаем объект типа Scanner для считывания пользовательского ввода
        Scanner scanner = new Scanner(System.in);

// запрашиваем у пользователя ФИО и дату рождения
        System.out.print("Введите свое ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите свою дату рождения в формате дд.мм.гггг: ");
        String birthDateString = scanner.nextLine();

// преобразуем введенную пользователем дату рождения в объект LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

// запрашиваем у пользователя адрес и переводим его в краткий формат
        System.out.print("Введите свой адрес в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24': ");
        String fullAddress = scanner.nextLine();
        String[] addressParts = fullAddress.split(", ");
        String country = addressParts[0].split(": ")[1];
        String city = addressParts[1].split(": ")[1];
        String street = addressParts[2].split(": ")[1];
        String house = addressParts[3].split(": ")[1];
        String apartment = addressParts[4].split(": ")[1];
        String shortAddress = country + "\n" + "г. " + city + "\n" + "ул. " + street + "\n" + "д. " + house + "\n" + "кв. " + apartment;

// вычисляем количество полных лет пользователя и выводим на экран
        Period age = Period.between(birthDate, LocalDate.now());
        int ageInYears = age.getYears();
        System.out.println("Вам " + ageInYears + " лет");

// вычисляем количество полных месяцев, которые пользователь прожил, и выводим на экран
        long ageInMonths = age.toTotalMonths();
        System.out.println("Вы прожили " + ageInMonths + " полных месяцев");

// выводим адрес пользователя в кратком формате
        System.out.println("Ваш адрес:");
        System.out.println(shortAddress);
    }
}
