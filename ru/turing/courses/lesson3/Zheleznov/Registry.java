package ru.turing.courses.lesson3.Zheleznov;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Registry<T extends Car> {
    //создал мапу с ключами и объектами
    private final Map<Integer, T> storage = new HashMap<>();
    //функция, отвечающая за добавление объектов в реестр
    public void add(Integer key, T value) {
        storage.put(key, value);
    }
    //функция, отвечающая за удаление объектов по ключам
    public T removeByKey(Integer key) {
        return storage.remove(key);
    }
    //функция, отвечающая за удаление объектов по значению
    public List<Integer> removeByValue(T value) {
        if(value != null){
            List<Integer> keys = new ArrayList<>();
            for (Map.Entry<Integer, T> entry : storage.entrySet()) {
                if (entry.getValue().equals(value)) {
                    keys.add(entry.getKey());
                }
            }
            storage.entrySet()
                    .removeIf(entry -> entry.getValue().equals(value));
            return keys;
        }
        return Collections.emptyList();
    }
    //очистить всё
    public void clear() {
        storage.clear();
    }
    //находит значение по ключу(по id)
    public T getByKey(Integer key) {
        return storage.get(key);
    }
    //функция выводит все объекты
    public void printMaxSpeed() {
        for (Map.Entry<Integer, T> entry : storage.entrySet()) {
            System.out.println(entry.getKey() + ". Максимальная скорость = " + entry.getValue().getCarMaxSpeed());
        }
    }
}

