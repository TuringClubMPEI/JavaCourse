package ru.turing.courses.lesson3.VersionA;

public class Main {
    public static void main(String[] args) {

        Registry animals = new Registry();

        //Добавление записей
        animals.add("панда1", new Panda("панда", false, 70, "Сычуань", 12));
        animals.add("панда2", new Panda("панда", false, 75, "Ганьсу", 10));
        animals.add("панда3", new Panda("панда", false, 80, "Сычуань", 11));
        animals.add("панда4", new Panda("панда", false, 75, "Ганьсу", 10));

        animals.add("аист1",  new Stork("аист", false, 3.5, 120, 16));
        animals.add("аист2",  new Stork("аист", false, 4.5, 130, 16));
        animals.add("аист3",  new Stork("аист", false, 5.5, 135, 16));

        System.out.println("Кол-во записей = " + animals.size());

        Panda panda = animals.removeByKey("панда1");
        System.out.println("Удаленная запись: панда, которая проживала в " + panda.getRegionOfChina());
        System.out.println("Кол-во записей = " + animals.size());

        Stork stork = animals.removeByKey("аист2");
        System.out.println("Удаленная запись: аист, у которого размах крыльев = " + stork.getWingspan());
        System.out.println("Кол-во записей = " + animals.size());

        panda = animals.getByKey("панда2");
        System.out.println("Поиск и нахождение записи: панда, которая проживала в " + panda.getRegionOfChina());

        stork = animals.getByKey("аист1");
        System.out.println("Поиск и нахождение записи: аист, у которого размах крыльев =  " + stork.getWingspan());

        System.out.println("Список ключей удаленных записей по значению: " + animals.removeByValue(panda));
        System.out.println("Кол-во записей = " + animals.size());

        System.out.println("Чистка реестра ");
        animals.clear();
        if (animals.isEmpty())
            System.out.println("Записей нет");
        else System.out.println("Записи есть");
    }
}
