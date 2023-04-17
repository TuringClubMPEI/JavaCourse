package ru.turing.courses.lesson2.Yemelyanov;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class UserProcessor {
    public void convertAdress(Person person, String[] finalAdressPart) { //Парсинг входной строки по формату в массив строк для вывода с новой строчки
        int currentPosition = 0;

        String adress = person.getAdress();
        String[] adressParts = adress.split(", ");
        for (String elem : adressParts) {
            String[] adressElem = elem.split(":");
            if (adressElem[0].equals("страна"))
                finalAdressPart[currentPosition] = adressElem[1];
            if (adressElem[0].equals("город"))
                finalAdressPart[currentPosition] = "г." + adressElem[1];
            if (adressElem[0].equals("улица"))
                finalAdressPart[currentPosition] = "ул." + adressElem[1];
            if (adressElem[0].equals("дом"))
                finalAdressPart[currentPosition] = "д." + adressElem[1];
            if (adressElem[0].equals("квартира"))
                finalAdressPart[currentPosition] = "кв." + adressElem[1];
            currentPosition++;
        }
        return;
    }

    // Метод для вывода адреса по формату
    public void showAdress(String[] adressPart) {
        for (String elem : adressPart) {
            System.out.println(elem);
        }
        return;
    }

    // Метод для подсчета возрасат: если flag = 1 - расчет возраста в годах, иначе в месяцах
    public int getAge(Person person, int flag) {
        LocalDate birthDay = person.getDateOfBirth();
        if (flag == 1) return Period.between(birthDay, LocalDate.now()).getYears();
        else return Period.between(birthDay, LocalDate.now()).getMonths();
    }


}
