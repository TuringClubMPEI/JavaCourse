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

        Registry<PornhubUser> pornhubUserRegistry = new Registry<>();

        pornhubUserRegistry.add(ivtiStudent1.getUserId(), ivtiStudent1);
        pornhubUserRegistry.add(ivtiStudent2.getUserId(), ivtiStudent2);
        pornhubUserRegistry.add(ivtiStudent3.getUserId(), ivtiStudent3);
        pornhubUserRegistry.add(ivtiStudent4.getUserId(), ivtiStudent4);

        System.out.println("проверка getByKey");
        System.out.println(pornhubUserRegistry.getByKey(ivtiStudent1.getUserId()).getUserName());

        System.out.println("проверка RemoveByKey");
        PornhubUser removedUser = pornhubUserRegistry.removeByKey(ivtiStudent2.getUserId());
        System.out.println(removedUser.toString());
        pornhubUserRegistry.printInfo();

        System.out.println("проверка RemoveByValue");
        pornhubUserRegistry.add(5, null);
        pornhubUserRegistry.add(6, null);
        System.out.println("Дo: ");
        pornhubUserRegistry.printInfo();
        List<Integer> removedUsers = pornhubUserRegistry.removeByValue(null);
        System.out.println("После: ");
        pornhubUserRegistry.printInfo();
        System.out.println("Ключи: ");
        removedUsers.forEach(System.out::println);

        System.out.println("проверка getByName");
        List<PornhubUser> usersWithSameName = pornhubUserRegistry.getByName("Unknown");
        usersWithSameName.forEach(element -> System.out.println(element.toString()));

        System.out.println("проверка сlear");
        pornhubUserRegistry.clear();
        pornhubUserRegistry.printInfo();

        System.out.println("Ну и просто тот факт что я могу создать реестр пихнув в него другой тип");
        InstagramUser LionelMessi = new InstagramUser("leomessi", true);
        Registry<InstagramUser> instagramUserRegistry = new Registry<>();
        instagramUserRegistry.add(LionelMessi.getUserId(), LionelMessi);
        instagramUserRegistry.printInfo();

    }
}
