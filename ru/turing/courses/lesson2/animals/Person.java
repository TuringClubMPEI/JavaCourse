package ru.turing.courses.lesson2.animals;

import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name; //имя
    private String surname; //фамилия
    private String secondName; //отчество
    private LocalDate birthday; //дата рождения
    private String address; // адрес проживания

    /**
     * Получение полных прожитых месяцев.
     *
     * @return целое число месяцев.
     */
    public int getFullMonths() {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(this.birthday, now);
        return diff.getMonths() + 12 * diff.getYears();
    }

    /**
     * Получение полных прожитых лет.
     *
     * @return целое число лет.
     */
    public int getFullYears() {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(this.birthday, now);
        return diff.getYears();
    }

    /**
     * Вывод адреса человека в коротком формате.
     *
     * @param regex - регулярное выражение, поторое показывает,
     *              какие радлелительные знаки использованиы в адресе.
     */
    public void printShortAddress(String regex) {
        //String regex = ":.+?,$?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.address); //поисковик регулярных выражений в строке
        int countString = 0; //на 2-5 выводе нужно добавить г., ул. и тд
        while (matcher.find()) { //поиск всех вхождений
            countString++;
            switch (countString) {
                case 2: {
                    System.out.print("г. ");
                    break;
                }
                case 3: {
                    System.out.print("ул. ");
                    break;
                }
                case 4: {
                    System.out.print("д. ");
                    break;
                }
                case 5: {
                    System.out.print("кв. ");
                    break;
                }
            }
            int start = matcher.start(); //индекс символа ":"
            int end = matcher.end(); //индекс символа ","
            System.out.println(this.address.substring(start + 2, end - 1)); //выбираем очередную подстроку без ":" и ","
        }
    }

    /**
     * Получение даты рождения в виде строки определённого формата.
     *
     * @param regex - регулярное выражения, которое задает формат строки.
     * @return строку, которая соответствует дате рождения.
     */
    public String getBirthday(String regex) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex);
        return this.birthday.format(formatter);
    }

    /**
     * Устанавливает дату рождения данного человека.
     *
     * @param strDate - строка, которая содержит дату рождения в заданном формате.
     * @param regex   - регулярное выражения, которое задаёт формат строки с датой рождения.
     * @return - true, если дата роджения была установлена; false, если установить дату рождения не получилось.
     */
    public boolean setBirthday(String strDate, String regex) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex);
        try {
            this.birthday = LocalDate.parse(strDate, formatter);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

    /**
     * Устанавливает адрес данного человека.
     *
     * @param strAddres - строка, содержащая адрес.
     * @param regex     - регулярное выражение, которое задаёт формат строки с адресом.
     * @return - true, если строка strAddres удовлетворяет регулярному выражения, иначе false.
     */
    public boolean setAddres(String strAddres, String regex) {
        if (Pattern.matches(regex, strAddres)) {
            this.address = strAddres;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Устанавлявает ФИО данного человека.
     *
     * @param name       - имя человека.
     * @param surname    - фамилия человека
     * @param secondName - отчество человека.
     */
    public void setFIO(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(secondName, person.secondName) && Objects.equals(birthday, person.birthday) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, secondName, birthday, address);
    }
}
