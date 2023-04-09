package ru.turing.courses.lesson1.Marchinskya;

import java.time.Year;
import java.time.ZoneId;
import java.util.Date;

/**
 * Класс с пользовательскими данными
 */
public class User {
    private final String fio;
    private final String address;
    private final Date dateOfBirth;

    public User(String fio, String address, Date dateOfBirth) {
        this.address = address;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Метод получения количества полных лет пользователя
     */
    public int getFullYears() {
        int year = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).getYear();
        return Year.now().getValue() - year;
    }

    /**
     * Метод получения количества полных месяцев пользователя
     */
    public int getFullMonth() {
        int year = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).getYear();
        int months = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).getMonthValue();
        return months + (Year.now().getValue() - year) * 12;
    }

    @Override
    public String toString() {
        return "ФИО " +
                fio +
                "\n" +
                "Полных лет: " +
                getFullYears() +
                "\n" +
                "Количество месяцев: " +
                getFullMonth() +
                "\n" +
                "Адрес " +
                "\n" +
                address;
    }
}
