package ru.turing.courses.lesson3.byazrov;

import java.util.*;

public class Homework{
    public static void main(String[] args) {
        Set<String> namesOfFruits = new HashSet<>(List.of("Яблоко", "Банан"));
        FruitQuantity installationInHall = new FruitInstallation(40, namesOfFruits, true, 20, "Инсталляция в коридоре", true);
        FruitQuantity installationInLounge = new FruitInstallation(60, namesOfFruits, true, "Инсталляция в гостиной", true);

        Registry<FruitQuantity> registry = new Registry<>();

        registry.add(installationInHall);
        registry.add(installationInLounge);

        registry.getByName("Инсталляция в коридоре");

        System.out.println(registry);

    }
}
