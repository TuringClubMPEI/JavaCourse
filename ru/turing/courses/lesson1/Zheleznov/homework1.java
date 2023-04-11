package ru.turing.courses.lesson1.Zheleznov;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//прошу ввести данные пользователя с клавиатуры
        System.out.println("Введите свое ФИО");
        String initiatives = scanner.nextLine();
        System.out.println("Введите дату рождения в формате: дд.мм.гггг");
        String dateofbirth = scanner.nextLine();
        System.out.println(" Введите свой адрес в формате: страна:, город:, улица:, дом:, квартира:");
        String address = scanner.nextLine();

//считаю количество полных лет и месяцев
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthday = LocalDate.parse(dateofbirth, formatter);
        LocalDate currentDate = LocalDate.now();
        Period livedlife = Period.between(birthday, currentDate);
        int years = livedlife.getYears();
        int months = livedlife.getMonths() + years * 12;
        System.out.println("Полных лет: " + years + " полных месяцев: " + months);

//делаю вывод в соответствии с заданием
        String[] postfixes = new String[]{"", "г. ", "ул. ", "д. ", "кв. "};
        String[] addressmas = address.split(",");
        int j = 0;
        for (String i : addressmas) {
            final String[] addressmassif = i.split(": ");
            System.out.println(postfixes[j] + addressmassif[1]);
            j++;
        }
    }

}
