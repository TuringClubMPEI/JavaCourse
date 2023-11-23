package ru.turing.courses.lesson3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Registry<Integer> instance = new Registry();
        instance.add(1, 3);
        instance.add(2, 2);
        instance.add(3, 1);
        instance.add(4,3);
        ArrayList<Integer> keysList=instance.getByName(3);
        System.out.println("ключи, по которым хранится значение 3:");
        for(Integer key:keysList)
            System.out.print(key+" ");
        System.out.print("\n");
        System.out.println("размер реестра "+instance.getSize());
        System.out.println("по ключу 1 удаляется значение " + instance.removeByKey(1));
        System.out.println("поиск элемента по ключу 1 - "+instance.getByKey(1));
        System.out.println("размер после удаления одного элемента - "+instance.getSize());
        instance.clear();
        System.out.println("размер после очистки - "+instance.getSize());
    }
}
