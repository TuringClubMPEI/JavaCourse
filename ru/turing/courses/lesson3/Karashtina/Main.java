package ru.turing.courses.lesson3.Karashtina;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаем регистр
        ProductRegistry productRegistry = ProductRegistry.getInstance();
        //прописываем ключ - значение, хранящиеся в регистре
        productRegistry.add(1, "Молоко");
        productRegistry.add(2, "Сыр");
        productRegistry.add(3, "Курица");
        productRegistry.add(4, "Сыр");
        productRegistry.add(5, "Помидоры");
        //выводим размер регистра
        System.out.println(productRegistry.numberOfKeys());
        //проверям содержит ли регистр определенный ключ
        System.out.println(productRegistry.containsKey(6));
        //выводим значения, у которых определенный ключ
        System.out.println(productRegistry.getByKey(1));
        System.out.println(productRegistry.getByKey(2));
        System.out.println(productRegistry.getByKey(3));

        //создаем список, находим определенное значение, удаляем и выводим ключ удаленной записи
        List<Integer> keysToRemove = ProductRegistry.removeByValue("Сыр");
        for (Integer key : keysToRemove) {
            System.out.println(key);
        }
        //создаем список и выводим значение найденной записи
        List<Integer> valueToGet = productRegistry.getByName("Молоко");
        for (Integer value : valueToGet) {
            System.out.println(value);
        }
    }
}
