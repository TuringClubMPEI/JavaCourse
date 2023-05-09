package ru.turing.courses.lesson3.byazrov;

public class Homework{
    public static void main(String[] args) {
        FruitQuantity installationInHall = new FruitInstallation(40, "Яблоко,Банан", true, 20, "Инсталляция в коридоре", true);
        FruitQuantity installationInLounge = new FruitInstallation(60, "Яблоко,Банан,Апельсин", true, "Инсталляция в гостиной", true);

        Registry<FruitQuantity> registry = new Registry<>();

        registry.add(installationInHall);
        registry.add(installationInLounge);

        registry.getByName("Инсталляция в коридоре");

        System.out.println(registry);

    }
}
