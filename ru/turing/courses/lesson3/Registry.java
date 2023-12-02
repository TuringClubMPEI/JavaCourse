package ru.turing.courses.lesson3;

import javax.naming.Name;
import java.util.*;

import static javax.swing.UIManager.put;

public class Registry <T extends Animal> {
    private final Map<Integer, T> storage = new HashMap<>();


    //Добавление в реестр новой записи
    public void add(int key, T value) {
        storage.put(key, value);
    }

    //Удаление из реестра записи по заданному ключу
    public T removeByKey(int key) {
        return storage.remove(key);
    }

    //Удаление из реестра записей по заданному значению
    public List<Integer> removeByValue(T valueToRemove) {
        if (storage.containsValue(valueToRemove)) {
            //создаю лист для ключей, потому что если сразу во время обхода менять составляющие, то выдает ошибку
            List<Integer> keys = new ArrayList<>();

            for (int key : storage.keySet()) {
                T tmpValue = storage.get(key);

                if (tmpValue.equals(valueToRemove)) {
                    keys.add(key);
                }
            }
            //длелаем обход storage по листу ключей, которые подлежат удалению и удалем их метомод removeByKey
            for (int key : keys) {
                removeByKey(key);
            }
            return keys;
        } else {
            return Collections.emptyList();
        }
    }

    //Полностью очищает реестр
    public void clear() {
        storage.clear();
    }

    //Находит значение по id
    public T getByKey(int key) {

        /*HashMap<Object, Object> keysAndValues = new HashMap<>();
        Object value = storage.get(key);
        keysAndValues.put(key, value);*/

        return storage.get(key);
    }

    //Найти значение по имени
    public List<T> getByName(String name){
        List<T> names =  new ArrayList<>();
        /*List<Integer> keys = new ArrayList<>();*/

        for(Map.Entry<Integer, T > shelf : storage.entrySet()){
            if(shelf.getValue().getName().equals(name)){
               names.add(shelf.getValue());
            }
        }
        /*storage.get();*/
        return names;
    }


}
