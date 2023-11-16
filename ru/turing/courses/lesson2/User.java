package ru.turing.courses.lesson2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    protected String name;
    protected String dateOfBirth;
    protected String country;
    protected String index;
    protected String city;
    protected String street;
    protected String house;
    protected String flat;

    public static String dateFromMoscow() {
        ZoneId timeZone = ZoneId.of("Europe/Moscow");
        ZonedDateTime timeZoneNowTime = ZonedDateTime.now(timeZone);
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(timeZoneNowTime);
    }

    protected void printYearsLived() {
        String date = dateFromMoscow();
        int y = Integer.parseInt(date.substring(6, 10)) - Integer.parseInt(dateOfBirth.substring(6, 10)),
                m = Integer.parseInt(date.substring(3, 5));
        if (m <= Integer.parseInt(dateOfBirth.substring(3, 5))) {
            if (m < Integer.parseInt(dateOfBirth.substring(3, 5)) ||
                    Integer.parseInt(date.substring(0, 2)) < Integer.parseInt(dateOfBirth.substring(0, 2)))
                y--;
        }
        System.out.printf("%s has lived %d years\n", name, y);
    }

    public void printMonthsLived() {
        String date = dateFromMoscow();
        int y = Integer.parseInt(date.substring(6, 10)) - Integer.parseInt(dateOfBirth.substring(6, 10)),
                m = Integer.parseInt(date.substring(3, 5));
        int d = Integer.parseInt(date.substring(0, 2));
        if (m <= Integer.parseInt(dateOfBirth.substring(3, 5))) {
            if (m < Integer.parseInt(dateOfBirth.substring(3, 5)) ||
                    d < Integer.parseInt(dateOfBirth.substring(0, 2)))
                y--;
        }
        int k = y * 12 + m - Integer.parseInt(dateOfBirth.substring(3, 5));
        if (m - Integer.parseInt(dateOfBirth.substring(3, 5)) < 0)
            k += 12;
        if (d < Integer.parseInt(dateOfBirth.substring(0, 2)))
            k--;
        System.out.printf("%s has lived %d months\n", name, k);
    }

    public void printAdress() {
        String ans = name + " lives in " + house + " " + street + " str., " + flat +
                " fl. " + city + " " + index + " " + country + ".\n";
        // так то у меня раньше println стоял, чтобы адрес можно было в случае чего прикрепить куда-нибудь,
        // но можно и перенос строки в конец добавить и выводить обычным принтом
        System.out.print(ans);
    }

    public User(String name, String dateOfBirth, String country, String index, String city,
                String street, String house, String flat) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public User() {
        // пустой конструктор по факту не использую, но пусть будет как создание без инициализации
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }

}

