package ru.turing.courses.lesson3.Karashtina;

import java.util.*;

public class Registry<T extends Product> {
    private final Map<Integer, T> storage = new HashMap<>();

    //добавляем объекты
    public void add(Integer key, T object) {
        storage.put(key, object);
    }

    //получаем объект по ключу
    public T getByKey(Integer key) {
        return storage.get(key);
    }

    //проверяем, содержит ли реестр данный ключ
    public boolean containsKey(Integer key) {
        return storage.containsKey(key);
    }

    //удаляем объект по ключу
    public T removeByKey(Integer key) {
        return storage.remove(key);
    }

    //находим все объекты с определенным именем
    public List<T> getByName(String name) {
        List<T> results = new ArrayList<>();
        for (T object : storage.values()) {
            if (Objects.equals(object.getName(), name)) {
                results.add(object);
            }
        }
        return results;
    }

    //удаляем все определенные объекты
    public List<Integer> removeByValue(T object) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, T> entry : storage.entrySet()) {
            if (Objects.equals(entry.getValue(), object)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (Integer key : keysToRemove) {
            storage.remove(key);
        }
        return keysToRemove;
    }

    //узнаем размер реестра
    public Integer size() {
        return storage.size();
    }

    //очищаем реестр
    public void clear() {
        storage.clear();
    }
}
