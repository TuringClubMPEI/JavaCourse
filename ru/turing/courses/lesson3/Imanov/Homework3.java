package ru.turing.courses.lesson3.Imanov;

import ru.turing.courses.lesson3.Imanov.user.InstagramUser;
import ru.turing.courses.lesson3.Imanov.user.PornhubUser;
import ru.turing.courses.lesson3.Imanov.registry.Registry;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {

        System.out.println();
        // проверка работоспособности кода
        PornhubUser ivtiStudent1 = new PornhubUser("Unknown", "guys (solo)");
        PornhubUser ivtiStudent2 = new PornhubUser("Наруто", "hentai");
        PornhubUser ivtiStudent3 = new PornhubUser("Изоморфизм", "BDSM");
        PornhubUser ivtiStudent4 = new PornhubUser("Unknown", "Asians");

        Registry<PornhubUser> PornhubUserRegisrtry = new Registry<>();

        PornhubUserRegisrtry.add(ivtiStudent1.getUserId(), ivtiStudent1);
        PornhubUserRegisrtry.add(ivtiStudent2.getUserId(), ivtiStudent2);
        PornhubUserRegisrtry.add(ivtiStudent3.getUserId(), ivtiStudent3);
        PornhubUserRegisrtry.add(ivtiStudent4.getUserId(), ivtiStudent4);

        System.out.println("проверка getByKey");
        System.out.println(PornhubUserRegisrtry.getByKey(ivtiStudent1.getUserId()).getUserName());

        System.out.println("проверка RemoveByKey");
        PornhubUser removedUser = PornhubUserRegisrtry.removeByKey(ivtiStudent2.getUserId());
        System.out.println(removedUser.getUserName());
        PornhubUserRegisrtry.printInfo();

        System.out.println("проверка RemoveByValue");
        PornhubUserRegisrtry.add(5, null);
        PornhubUserRegisrtry.add(6, null);
        System.out.println("Дo: ");
        PornhubUserRegisrtry.printInfo();
        List<Integer> removedUsers = PornhubUserRegisrtry.removeByValue(null);
        System.out.println("После: ");
        PornhubUserRegisrtry.printInfo();
        System.out.println("Ключи: ");
        removedUsers.forEach(System.out::println);

        System.out.println("проверка getByName");
        List<PornhubUser> usersWithSameName = PornhubUserRegisrtry.getByName("Unknown");
        usersWithSameName.forEach(element -> System.out.println(element.getUserName()));

        System.out.println("проверка сlear");
        PornhubUserRegisrtry.clear();
        PornhubUserRegisrtry.printInfo();



    }
}
