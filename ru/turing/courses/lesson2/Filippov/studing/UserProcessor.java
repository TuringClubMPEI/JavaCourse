package ru.turing.courses.lesson2.Filippov.studing;

public class UserProcessor {
    public String getShortAddress(String address) {
        String[] addressSplit = address.split("((: )|:|,)");//разделим либо ":", либо ",", либо ": "
        return (addressSplit[1] + "\nг. " + addressSplit[3] + "\nул. " + addressSplit[5] + "\nд. " + addressSplit[7] + "\nкв. " + addressSplit[9]);
    }

    public String getCountYear(String date) {
        String[] dataSplit = date.split("\\.");//создаем массив из дня месяца и года
        int year = Integer.parseInt(dataSplit[2]);//переводим из типа стринг в тип инт
        int months = Integer.parseInt(dataSplit[1]);
        String yearString = "";
        if ((year == 2023) & (months > 4)) {
            yearString = "Ошибка";
        } else {
            year = 2023 - year - 1;//считаем года
            months = 12 - months + 4;//+4 т.к. сейчас апрель ;)считаем месяцы
            if (months >= 12) {//проверка чтобы не писать 12 месяцев
                year++;
            }
            yearString = Integer.toString(year) + " лет(года) ";

        }
        return yearString;

    }

    public String getCountMonths(String date) {
        String[] dataSplit = date.split("\\.");
        int months = Integer.parseInt(dataSplit[1]);
        months = 12 - months + 4;//+4 т.к. сейчас апрель ;)считаем месяцы
        if (months >= 12) {//проверка чтобы не писать 12 месяцев
            months = 0;
        }
        String monthsString = Integer.toString(months) + "месяца(месяцев)";
        return monthsString;
    }

}


