package ru.turing.courses.lesson3.privalov;

import ru.turing.courses.lesson3.privalov.engines.LiquidPropellantRocketEngine;
import ru.turing.courses.lesson3.privalov.engines.SolidPropellantRocketEngine;

public class Solution {
    public static void main(String[] args) {
        //Создаем два регистра: под твердотопливные и под жидкостные ракетные движки
        Registry<SolidPropellantRocketEngine> SolidEngines = new Registry<>();
        Registry<LiquidPropellantRocketEngine> LiquidEngines = new Registry<>();

        //Создаем инстансы
        SolidPropellantRocketEngine SolidEngine1 = new SolidPropellantRocketEngine("Solid 1", 250, "ammonia", "aluminium", 360);
        SolidPropellantRocketEngine SolidEngine2 = new SolidPropellantRocketEngine("Solid 2", 270, "ammonia", "polybutadiene", 480);
        SolidPropellantRocketEngine SolidEngine3 = new SolidPropellantRocketEngine("Solid 3", 270, "ammonia", "polybutadiene", 400);

        LiquidPropellantRocketEngine LiquidEngine1 = new LiquidPropellantRocketEngine("L1", 300, "kerosine", "oxygen", 20);
        LiquidPropellantRocketEngine LiquidEngine2 = new LiquidPropellantRocketEngine("L2", 320, "methane", "oxygen", 35);

        //Добавляем твердотопливные движки в их регистр, проверяем регистр
        SolidEngines.add(SolidEngine1.hashCode(), SolidEngine1);
        SolidEngines.add(SolidEngine2.hashCode(), SolidEngine2);
        SolidEngines.add(SolidEngine3.hashCode(), SolidEngine3);
        SolidEngines.printAllEntries();

        //Добавляем жидкостные движки в их регистр, проверяем регистр
        LiquidEngines.add(LiquidEngine1.hashCode(), LiquidEngine1);
        LiquidEngines.add(LiquidEngine2.hashCode(), LiquidEngine2);
        LiquidEngines.printAllEntries();

        //Удаляем запись по ключу, проверяем
        SolidEngines.removeByKey(1434165550);
        SolidEngines.printAllEntries();

        //Удаляем запись по значению, проверяем
        SolidEngines.removeByValue(SolidEngine2);
        SolidEngines.printAllEntries();

        //Очищаем регистр
        SolidEngines.clear();
        SolidEngines.printAllEntries();

        //Получаем объект по его ключу, выводим его имя
        System.out.println(LiquidEngines.getByKey(1572711).getSerialName());
    }
}
