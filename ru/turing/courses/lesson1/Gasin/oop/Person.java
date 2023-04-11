package ru.turing.courses.lesson1.Gasin.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.*;

/**
 * Пользователь
 */
public class Person {
    /**
     * Имя
     */
    private String firstName;
    /**
     * Отчество
     */
    private String middleName;
    /**
     * Фамилия
     */
    private String lastName;
    /**
     * Адрес
     */
    private String address;
    /**
     * Дата рождения
     */
    private Date birthDate;

    /**
     * Форматировать адрес по правилам
     * @return
     */
    public String formatAddress(AddressFormatter formatter) {
        return formatter.format(address);
    }

    //2 метода ниже специально сделал по-разному, чтобы показать, как работать с датами

    public int getYears() {
        Calendar birthDayCal = getCalendar(birthDate);
        Calendar currentCal = getCalendar(new Date());
        int diff = currentCal.get(YEAR) - birthDayCal.get(YEAR);
        if (birthDayCal.get(MONTH) > currentCal.get(MONTH) ||
                (birthDayCal.get(MONTH) == currentCal.get(MONTH) && birthDayCal.get(DATE) > currentCal.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public int getMonths() {
        LocalDate currentLocalDate = Instant.ofEpochMilli(this.birthDate.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        Period between = Period.between(currentLocalDate, LocalDate.now());
        return between.getYears() * 12 + between.getMonths();
    }

    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.getDefault());
        cal.setTime(date);
        return cal;
    }

    public Person(String firstName, String middleName, String lastName, String address, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
