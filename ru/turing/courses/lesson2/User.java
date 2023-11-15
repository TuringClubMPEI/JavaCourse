package ru.turing.courses.lesson2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class User {
    protected String name;
    protected String dateOfBirth;
    protected int dayOfBirth;
    protected int monthOfBirth;
    protected int yearOfBirth;
    protected String country;
    protected String index;
    protected String city;
    protected String street;
    protected String house;
    protected String flat;

    protected void printYearsLived() {
        ZoneId z = ZoneId.of( "Europe/Moscow" );
        ZonedDateTime date2 = ZonedDateTime.now(z);
        String date = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm").format(date2);
        int y = Integer.parseInt(date.substring(6, 10)) - yearOfBirth, m = Integer.parseInt(date.substring(3, 5));
        if (m <= monthOfBirth) {
            if (m < monthOfBirth || Integer.parseInt(date.substring(0, 1)) < dayOfBirth)
                y--;
        }
        System.out.printf("%s has lived %d years\n", name, y);
    }

    public void printMonthsLived() {
        ZoneId z = ZoneId.of( "Europe/Moscow" );
        ZonedDateTime date2 = ZonedDateTime.now(z);
        String date = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm").format(date2);
        int y = Integer.parseInt(date.substring(6, 10)) - yearOfBirth, m = Integer.parseInt(date.substring(3, 5));
        int d = Integer.parseInt(date.substring(0, 2));
        if (m <= monthOfBirth) {
            if (m < monthOfBirth || d < dayOfBirth)
                y--;
        }
        int k = y * 12 + m - monthOfBirth;
        if (m - monthOfBirth < 0)
            k += 12;
        if (d < dayOfBirth)
            k--;
        System.out.printf("%s has lived %d months\n", name, k);
    }

    public void printAdress() {
        String ans;
        ans = name + " lives in " + house + " " + street + " str., " + flat +
                " fl. " + city + " " + index + " " + country + ".";
        System.out.println(ans);
    }

    public User(String name, String dateOfBirth, int dayOfBirth, int monthOfBirth, int yearOfBirth, String country, String index, String city, String street, String house, String flat) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public User() {
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        char[] fooo = new char[2];
        dateOfBirth.getChars(0, 1, fooo, 0);
        dayOfBirth = Integer.parseInt(new String(fooo));
        fooo = Arrays.copyOfRange(fooo, 0, 0);
        dateOfBirth.getChars(3, 4, fooo, 0);
        monthOfBirth = Integer.parseInt(new String(fooo));
        fooo = Arrays.copyOfRange(fooo, 0, 0);
        dateOfBirth.getChars(6, 9, fooo, 0);
        yearOfBirth = Integer.parseInt(new String(fooo));
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

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
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

    public User(String name, String dateOfBirth, String country, String city, String street, String house, String flat) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }
}

