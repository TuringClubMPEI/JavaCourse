package ru.turing.courses.lesson2;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final LocalDate birthday;
    private String address; //страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24

    //Получаем количество прожитых месяцев
    public int getLivedMonths() {
        LocalDate currentDate = LocalDate.now();
        int yearsLived = currentDate.getYear() - birthday.getYear();
        int monthsLived = currentDate.getMonthValue() - birthday.getMonthValue();
        return monthsLived + yearsLived * 12;
    }

    //Получаем количество прожитых лет
    public int getLivedYears() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthday.getYear();
    }

    //Выводим адрес короткой записью
    public void printShortAddress() {
        //ленивый квантификатор для поиска нужных слов
        String regex = "страна: (.*?), город: (.*?), улица: (.*?), дом: (.*?), квартира: (.*?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        if (matcher.matches()) {
            System.out.println(matcher.group(1));
            System.out.println("г. " + matcher.group(2));
            System.out.println("ул. " + matcher.group(3));
            System.out.println("д. " + matcher.group(4));
            System.out.println("кв. " + matcher.group(5));
        } else {
            System.out.println("Введен некорректный адрес");
        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(LocalDate birthday, String address) {
        this.birthday = birthday;
        this.address = address;
    }

}
