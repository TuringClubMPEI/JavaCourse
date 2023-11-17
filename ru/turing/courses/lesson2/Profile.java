package ru.turing.courses.lesson2;

import java.time.LocalDate;

public class Profile {
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate date;
    private String address;

    public Profile(String name, String surname, String patronymic, LocalDate date, String address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.date = date;
        this.address = address;
    }

    public Profile(String name, String surname, String patronymic, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean checkAddress(String address) {//Проверка адреса на соответствие шаблону
        boolean result = true;
        String[] addressSplit = address.split(" ");
        if (addressSplit.length == 10) {
            if (!addressSplit[0].equals("страна:") && !addressSplit[2].equals("город:") && !addressSplit[4].equals("улица:")
                    && !addressSplit[6].equals("дом:") && !addressSplit[8].equals("квартира:")) {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }

    public int quantityOfMonths() {//Подсчет количества полных месяцев
        LocalDate now = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int yearNow = now.getYear();
        int monthNow = now.getMonthValue();
        int dayNow = now.getDayOfMonth();
        int koefDay = (dayNow - day < 0) ? -1 : 0;
        int ans = 12 * (yearNow - year) + (monthNow - month) + koefDay;
        return Math.max(ans, 0);
    }

    public int quantityOfYears() {//Подсчет количества полных лет
        int month = this.quantityOfMonths();
        return month / 12;
    }

    public String shortAddressFormat() {//Перевод адреса в короткий вид
        String[] addressSplit = address.split(" ");
        String shortAddress = addressSplit[1].substring(0, addressSplit[1].length() - 1) + "\n";
        shortAddress = shortAddress + "г. " + addressSplit[3].substring(0, addressSplit[3].length() - 1) + "\n";
        shortAddress = shortAddress + "ул. " + addressSplit[5].substring(0, addressSplit[5].length() - 1) + "\n";
        shortAddress = shortAddress + "д. " + addressSplit[7].substring(0, addressSplit[7].length() - 1) + "\n";
        shortAddress = shortAddress + "кв. " + addressSplit[9];
        return shortAddress;
    }

}

