package ru.turing.courses.lesson3.Karashtina;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаем реестр для объектов класса Fruit
        Registry<Fruit> registry = new Registry<>();
        //Создаем и добавляем объекты Fruit в реестр
        Fruit apple = new Fruit(1, "яблоко", 90, 176, "красный");
        Fruit banana = new Fruit(2, "банан", 120, 150, "желтый");
        Fruit kiwi = new Fruit(3, "киви", 140, 80, "зеленый");
        registry.add(1, apple);
        registry.add(2, banana);
        registry.add(3, kiwi);
        //выводим размер реестра
        System.out.println("Размер реестра = " + registry.size());
        //проверям содержит ли реестр ключ 6
        System.out.println("Реестр содержит ключ 6: " + registry.containsKey(6));
        //получаем объект по ключу
        Fruit result = registry.getByKey(1);
        System.out.println(result);
        //находим все объекты с именем "банан"
        List<Fruit> result2 = registry.getByName("банан");
        System.out.println(result2);
        //удаляем объект по ключу
        Fruit removedFruit = registry.removeByKey(1);
        System.out.println(removedFruit);
        //удаляем все объекты Kiwi
        List<Integer> removedKeys = registry.removeByValue(kiwi);
        System.out.println("Ключ удаленного объекта: " + removedKeys);
        //очищаем реестр
        registry.clear();
    }
}
