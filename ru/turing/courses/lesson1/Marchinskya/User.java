package ru.turing.courses.lesson1.Marchinskya;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

/**
 * Класс с пользовательскими данными
 */
public class User {
    private final String fio;
    private final String address;
    private final LocalDate dateOfBirth;

    public User(String fio, String address, LocalDate dateOfBirth) {
        this.address = address;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Метод получения количества полных лет пользователя
     */
    public int getFullYears() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    /**
     * Метод получения количества полных месяцев пользователя
     */
    public int getFullMonths() {
        int year = dateOfBirth.getYear();
        int months = dateOfBirth.getMonthValue();
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
                getFullMonths() +
                "\n" +
                "Адрес " +
                "\n" +
                address;
    }
}
