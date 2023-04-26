package ru.turing.courses.lesson3.filippov;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Registry<T extends Record> {
    private final Map<String, T> storage = new HashMap<>();

    //add(key, value) - добавить в реестр новую запись

    public void add(String key, T value) {
        storage.put(value.getId(), value);
    }

    //removeByKey(key) - удалить из реестра запись по заданному ключу. Возвращать должен значение записи

    public void removeByKey(String key) {

        if (storage.containsKey(key)) {
            T removeRecord = storage.get(key);
            storage.remove(key);
            System.out.println("Был удален пользователь:\n" + removeRecord);
        } else {
            System.out.println("Пользователя с таким ключом нет(");
        }
    }

    //- removeByValue(value) - удалить из реестра все записи по заданному значению. Возвращать должен List ключей удаленных записей

    public List<String> removeByValue(T value) {
        List<String> tempList = new ArrayList<>();

        if (value != null && storage.containsValue(value)) {
            for (Map.Entry<String, T> entry : storage.entrySet()) {
                if (value.equals(entry.getValue())) {
                    tempList.add(entry.getKey());

                }
            }
            tempList.forEach(element -> storage.remove(element));
        } else {
            System.out.println("В данном реестре нет записей с такими значений");
        }
        return tempList;
    }
    //- clear() - полностью очистить реестр

    public void clear() {
        if (!storage.isEmpty()) {
            storage.clear();
            System.out.println("Реестр очищен, все данные удалены");
        } else {
            System.out.println("Реестр уже пуст");
        }
    }

    // - getByKey(key) - найти значение по id. Возвращать значение с заданным id
    public T getByKey(String key) {
        if (storage.containsKey(key)) {
            return storage.get(key);
        } else {
            System.out.print("Пользователя с таким ключом нет:");
            return null;
        }
    }
    //- getByName(String name)

    public List<T> getByName(String info) {
        List<T> tempList = new ArrayList<>();
        boolean foundMatchingRecord = true;
        for (Map.Entry<String, T> entry : storage.entrySet()) {
            if (entry.getValue().getInfo().equals(info)) {
                tempList.add(entry.getValue());
                foundMatchingRecord = false;
            }
        }
        if (foundMatchingRecord) {
            System.out.println("В данном реестре нет записей с такими значений");
        }
        return tempList;
    }

    //вывод всех множеств ключ+значение

    public void view() {
        int count = 1;
        if (!storage.isEmpty()) {
            System.out.println("Реестр пуст");
            return;
        }
        for (Map.Entry<String, T> entry : storage.entrySet()) {
            System.out.println(count + ")" + "Ключ:" + entry.getKey() + "\nЗначение:\n" + entry.getValue());
            count++;
        }
    }
}

