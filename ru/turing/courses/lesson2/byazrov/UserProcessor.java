package ru.turing.courses.lesson2.byazrov;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserProcessor {

    //задание нужного типа даты
    private static LocalDate parseBirthDate(String birthDateLine) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return (LocalDate.parse(birthDateLine, formatter));

    }

    //возврат количества месяцев от роду
    public static int getMonthAge(String birthdate) {
        return Period.between(parseBirthDate(birthdate), LocalDate.now()).getMonths() + 12 * getYearAge(birthdate);
    }

    //возврат количества прожитых полных лет пользователя
    public static int getYearAge(String birthdate) {
        // LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(parseBirthDate(birthdate), LocalDate.now()).getYears();
    }

    //вывод отформатированного адреса
    public static void formatAddress(String addressLine) {
        String[] addressArr = addressLine.split(", ");
        String[] address = new String[5];

        for (int i = 0; i < 5; ++i) {
            String[] addressCluster = addressArr[i].split(": ");
            address[i] = addressCluster[1];
        }

        System.out.println(address[0] + "\nг. " + address[1] + " \nул. " + address[2] + "\nд. " + address[3] + "\nкв. " + address[4]);
    }
}
