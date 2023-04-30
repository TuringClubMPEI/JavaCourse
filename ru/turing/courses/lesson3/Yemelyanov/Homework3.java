package ru.turing.courses.lesson3.Yemelyanov;

import java.util.List;

public class Homework3 {
    public static void main(String[] args) {

        Vodka vodkaContainedType1 = new Vodka("Пшеничная", " Водка", "Россия");
        Vodka vodkaContainedType2 = new Vodka("Рисовый", "Сакэ", "Япония");
        Vodka vodkaContainedType3 = new Vodka("Анисовая","Водка", "Польша");
        Vodka vodkaContainedType4 = new Vodka("Виноградная", "Чача", "Армения");

        Registry<String, Vodka> vodkaRegistry = new Registry<>();

        //Добалвение записей в реестр
        vodkaRegistry.add(vodkaContainedType1.getItemId(), vodkaContainedType1);
        vodkaRegistry.add(vodkaContainedType2.getItemId(), vodkaContainedType2);
        vodkaRegistry.add(vodkaContainedType3.getItemId(), vodkaContainedType3);
        vodkaRegistry.add(vodkaContainedType4.getItemId(), vodkaContainedType4);

        //Проверка работоспособности getByKey - даже в том случае, если ключ не содержится в реестре
        System.out.println("Все записи по ключу 'Анисовая': " + vodkaRegistry.getByKey("Анисовая").getItemName());
        System.out.println("Все записи по ключу 'Рисовый': " + vodkaRegistry.getByKey("Рисовый").getItemName());
        System.out.println("Все записи по ключу 'Шоколадный': " + vodkaRegistry.getByKey("Шоколадный"));

        //Проверка работоспособности removeByKey
        System.out.println("Удаленная запись по ключу 'Виноградная': " + vodkaRegistry.removeByKey(vodkaContainedType2.getItemId()));

        List<String> deletedKeys = vodkaRegistry.removeByValue(vodkaContainedType3);
        System.out.println("Ключи: ");
        for(String elem: deletedKeys){
            System.out.println(elem);

        }
        System.out.println("Удаление реестра...");
        vodkaRegistry.clear();
    }
}
