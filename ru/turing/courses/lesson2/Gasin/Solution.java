package ru.turing.courses.lesson2.Gasin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        // Откровенно лень вводить
        final String fio = "Зубенко Михаил Петрович";
        final String dateOfBirth = "20.12.1999";
        final String address = "страна: Россия, город: Москва, улица: Авиамоторная, " +
                "дом: 15, квартира: 24";

        LocalDateTime userBirthDate = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy")).atStartOfDay();
        UserProcessor processor = new UserProcessor();
        int livedYears = processor.getLifespan(userBirthDate, ChronoUnit.YEARS);
        int livedMonths = processor.getLifespan(userBirthDate, ChronoUnit.MONTHS);
        String formattedAddress = processor.formatAddress(address);

        System.out.println(fio + " вы жили " + livedYears + " лет и " + livedMonths + " месяцев");
        System.out.println("Ваш адрес");
        System.out.println(formattedAddress);

        Bear bear1 = new Bear(20, true, "Black", true);
        Bear theSameBear1 = new Bear(20, true, "Black", true);
        Bear differentBear = new Bear(21, false, "Brown", false);
        System.out.println(bear1.equals(theSameBear1));
        System.out.println(bear1.equals(differentBear));

        Studying universityStudent = new UniversityStudent(10);
        Studying turingStudent = new TuringStudent("Java", 2);
        universityStudent.study();
        universityStudent.passExam(false);
        universityStudent.passExam(true);
        turingStudent.study();
        turingStudent.passExam(false);
        turingStudent.passExam(true);
    }
}
