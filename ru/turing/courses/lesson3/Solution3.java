package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.animals.Donkey;

public class Solution3 {
    public static void main (String[] args){
        Donkey dnkFirst = new Donkey("Danek", false, false, 4,
                3, 15, 0, true);
        Donkey dnkSecond = new Donkey("Vitek", false, true, 4,
                7, 25, 10, true);
        Donkey dnkThird = new Donkey("Salami", true, false, 3,
                6, 44, 0, true);
        AnimalRegistry <Integer, Donkey> journal = new AnimalRegistry<>("osliki");
        journal.add(1, dnkFirst);//
        journal.add(2, dnkSecond);
        journal.add(3, dnkThird);
        journal.add(5, dnkSecond);//
        journal.add(6, dnkFirst);//

        journal.printAll();

        System.out.println("now i'm deleting 5) " + journal.removeByKey(5).getName());

        journal.printAll();

        System.out.println("now i'm deleting all Daneks\n " + journal.removeByValue(dnkFirst));

        journal.printAll();

        System.out.println("finding Vitek... " + journal.getByName("Vitek"));
        System.out.println("finding Vitek's friends... " + journal.getByName("drug Vit'ka"));

        System.out.println("finding key 3) " + journal.getByKey(3).getName());

        journal.clear();

        System.out.println("all is clear...");

        journal.printAll();
    }
}
