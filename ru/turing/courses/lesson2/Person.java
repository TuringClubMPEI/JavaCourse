package ru.turing.courses.lesson2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Pattern;


public class Person {
    private String name, surname, secondName, address;
    private LocalDate data;

    public String getName() {
        return name;
    } //геты

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFIO(String surname, String name, String secondName) {//ввод фио
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
    }

    public boolean setData(String date, String regex) {//ввод даты и смена её формата
        DateTimeFormatter Form = DateTimeFormatter.ofPattern(regex);//задание формата строки
        try {
            this.data = LocalDate.parse(date, Form);//перевод строки с форматом в дату
            return true;
        } catch (DateTimeException exception) {
            return false;
        }
    }

    public boolean setAdr(String Sadr, String regex) {//ввод адреса
        if (Pattern.matches(regex, Sadr)) {//если строка соответсвует щаблону, то сохраняем её
            this.address = Sadr;
            return true;
        } else {
            return false;
        }
    }

    public int getMonth() {//вывод всех прожитых месяцев
        LocalDate now = LocalDate.now();//нынешняя дата
        Period difference = Period.between(this.data, now);//нахождение разницы
        return difference.getMonths() + 12 * difference.getYears();
    }

    public int getyears() {//вывод всех прожитых лет
        LocalDate now = LocalDate.now();//нынешняя дата
        Period otl = Period.between(this.data, now);//нахождение разницы
        return otl.getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(secondName, person.secondName) && Objects.equals(address, person.address) && Objects.equals(data, person.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, secondName, address, data);
    }

    //^страна: .+, город: .+, улица: .+, дом: \\d+, квартира: \\d+$
    public String splitAddress() {//вывод сокращенного адреса
        String s = "\n";//выводимая строка
        int index = 8;//индекс текущего символа(начинается с первой буквы страны)
        var c = this.address.charAt(index);//текущий символ
        while (c != ',') {//цикл для записи страны
            s += c;
            index++;
            c = address.charAt(index);
        }
        s += "\nг.";
        index = this.address.indexOf("город:") + 7;//переводим индекс на первую букву города
        c = this.address.charAt(index);
        while (c != ',') {//цикл для записи страны
            s += c;
            index++;
            c = this.address.charAt(index);
        }
        s += "\nул.";
        index = this.address.indexOf("улица:") + 7;//переводим индекс на первую букву улицы
        c = this.address.charAt(index);
        while (c != ',') {//цикл для записи города
            s += c;
            index++;
            c = this.address.charAt(index);
        }
        s += "\nд.";
        index = this.address.indexOf("дом:") + 5;//переводим индекс на первую цифру номера дома
        c = this.address.charAt(index);
        while (c != ',') {//цикл для записи дома
            s += c;
            index++;
            c = this.address.charAt(index);
        }
        s += "\nкв.";
        index = this.address.indexOf("квартира:") + 10;//переводим индекс на первую цифру номера квартиры
        c = this.address.charAt(index);
        while (c != ',') {//цикл для записи квартиры
            s += c;
            index++;
            if (index == this.address.length())
                break;
            c = this.address.charAt(index);
        }
        s += '\n';
        return s;

    }
}
