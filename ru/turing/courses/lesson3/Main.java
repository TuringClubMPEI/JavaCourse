package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.Profile;

import java.time.LocalDate;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Registry<Profile> reestr = new Registry();

        String[] datesString = {"1995-02-19", "1976-10-05", "2002-11-25"};
        LocalDate[] dates = new LocalDate[3];
        for (int i = 0; i < datesString.length; ++i) {
            dates[i] = LocalDate.parse(datesString[i]);
        }
        String[] addresses = {"страна: Россия, город: Москва, улица: Тверская, дом: 14, квартира: 60",
                "страна: Россия, город: Самара, улица: Юбилейная, дом: 66, квартира: 46",
                "страна: Россия, город: Саратов, улица: Ленина, дом: 5, квартира: 91"};
        Profile boris = new Profile("Борис", "Бритва", "Сергеевич", dates[0], addresses[0]);
        Profile nikolay = new Profile("Николай", "Петров", "Иванович", dates[1], addresses[1]);
        Profile olga = new Profile("Ольга", "Иванова", "Юрьевна", dates[2], addresses[2]);
        reestr.add(1, boris);
        reestr.add(2, nikolay);
        reestr.add(3, olga);

        System.out.println(reestr.toString() + "\n");
        System.out.println(reestr.removeByKey(1) + "\n");
        System.out.println(reestr.toString() + "\n");
        reestr.add(2, boris);
        reestr.add(1, boris);
        System.out.println(reestr.toString() + "\n");
        reestr.changeKey(1, 5);
        System.out.println(reestr.toString() + "\n");
        System.out.println(reestr.removeByValue(olga));
        System.out.println(reestr.removeByValue(olga));
        System.out.println(reestr.toString() + "\n");
        reestr.add(3, olga);
        System.out.println(reestr.getByKey(3));
        System.out.println(reestr.getByKey(10));
        try {
            System.out.println(reestr.getByName("Ольга"));
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
