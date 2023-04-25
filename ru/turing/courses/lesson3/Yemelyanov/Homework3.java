package ru.turing.courses.lesson3.Yemelyanov;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {

        VodkaContainedType vodkaContainedType1 = new VodkaContainedType("Пшеничная", " Водка");
        VodkaContainedType vodkaContainedType2 = new VodkaContainedType("Рисовый", "Сакэ");
        VodkaContainedType vodkaContainedType3 = new VodkaContainedType("Анисовая","Водка");
        VodkaContainedType vodkaContainedType4 = new VodkaContainedType("Виноградная", "Чача");

        Registry<String, VodkaContainedType> vodkaRegistry = new Registry<>();

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
        System.out.println("Удаленная запись по ключу 'Виноградная': " + vodkaRegistry.removeByKey(vodkaContainedType2.itemId).getItemName());

        List<String> deletedKeys = vodkaRegistry.removeByValue(vodkaContainedType3);
        System.out.println("Ключи: ");
        for(String elem: deletedKeys){
            System.out.println(elem);

        }
        System.out.println("Удаление реестра...");
        vodkaRegistry.clear();
    }
}
