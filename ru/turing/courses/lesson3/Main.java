package ru.turing.courses.lesson3;

import ru.turing.courses.lesson3.objects.Developer;
import ru.turing.courses.lesson3.objects.PremiumPlayer;
import ru.turing.courses.lesson3.objects.StandartPlayer;

public class Main {
    public static void main(String[] args) {
        Registry<StandartPlayer> standartPlayerRegistry = new Registry<StandartPlayer>();
        Registry<PremiumPlayer> premiumPlayerRegistry = new Registry<PremiumPlayer>();
        Registry<Developer> developerRegistry = new Registry<Developer>();


        StandartPlayer player_1 = new StandartPlayer("p_001", "Nagibator2010");
        PremiumPlayer player_2 = new PremiumPlayer("p_002", "Nagibator2014");
        Developer dev = new Developer("d_200", "Dead");
        dev.magicCommand();

        standartPlayerRegistry.add(player_1.getId(), player_1);
        premiumPlayerRegistry.add(player_2.getId(), player_2);
        developerRegistry.add(dev.getId(), dev);

        System.out.printf("Total developer balance is %s%n", String.valueOf(developerRegistry.getTotalUserBalance()));
    }
}
