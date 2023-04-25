package ru.turing.courses.lesson2.Yemelyanov;

import java.time.LocalDate;
import java.time.Period;

public class UserProcessor {

    private static final int ADRESS_POSITIONS = 5;

    public String[] convertAdress(Person person) { //Парсинг входной строки по формату в массив строк для вывода с новой строчки
        String[] finalAdressPart = new String[5];
        String adress = person.getAdress();
        String[] adressParts = adress.split(", ");
        for (int currentPosition = 0; currentPosition < ADRESS_POSITIONS; currentPosition++) {
            String elem = adressParts[currentPosition];
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
        }
        return finalAdressPart;
    }

    // Метод для вывода адреса по формату
    public void showAdress(String[] adressPart) {
        for (String elem : adressPart) {
            System.out.println(elem);
        }
    }

    // Метод для подсчета возраста
    public void printAge(Person person) {
        LocalDate birthDay = person.getDateOfBirth();
        int age = (Period.between(birthDay, LocalDate.now())).getYears();
        System.out.println("Кол-во прожитых лет: " + age);
        System.out.println("Кол-во прожитых месяцев: " + Period.between(birthDay, LocalDate.now()).getMonths() + 12 * age);
    }
}
