package ru.turing.courses.lesson3;

import ru.turing.courses.lesson3.objects.Developer;
import ru.turing.courses.lesson3.objects.PremiumPlayer;
import ru.turing.courses.lesson3.objects.StandartPlayer;

public class Main {
    public static void main(String[] args) {
        Registry<StandartPlayer> standartPlayerRegistry = new Registry<StandartPlayer>();
        Registry<PremiumPlayer> premiumPlayerRegistry = new Registry<PremiumPlayer>();
        Registry<Developer> developerRegistry = new Registry<Developer>();


        StandartPlayer playerOne = new StandartPlayer("p_001", "Nagibator2010");
        PremiumPlayer playerTwo = new PremiumPlayer("p_002", "Nagibator2014");
        Developer dev = new Developer("d_200", "Dead");
        dev.magicCommand();

        standartPlayerRegistry.add(playerOne.getId(), playerOne);
        premiumPlayerRegistry.add(playerTwo.getId(), playerTwo);
        developerRegistry.add(dev.getId(), dev);

        System.out.printf("Total developer balance is %s%n", String.valueOf(developerRegistry.getTotalUserBalance()));
    }
}
