package ru.turing.courses.lesson3.Shishlova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry<T> { // тип T указывает на класс, который мы храним в реестре
    // HashMap для хранения записей
    private Map<String, T> data = new HashMap<>();
    /**
     * Добавление новой записи в реестр
     *
     * @param key   ключ записи
     * @param value значение записи
     */
    public void add(String key, T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        data.put(key, value);
    }

    /**
     * Удаление записи из реестра по заданному ключу
     *
     * @param key ключ записи
     * @return значение удаленной записи или null, если такого ключа не было в реестре
     */
    public T removeByKey(String key) {
        return data.remove(key);
    }

    /**
     * Удаление всех записей из реестра по заданному значению
     *
     * @param value значение записи
     * @return список ключей удаленных записей
     */
    public List<String> removeByValue(T value) {
        List<String> deletedKeys = new ArrayList<>();
        for (Map.Entry<String, T> entry : data.entrySet()) {
            if (entry.getValue().equals(value)) {
                deletedKeys.add(entry.getKey());
            }
        }
        for (String key : deletedKeys) {
            data.remove(key);
        }
        return deletedKeys;
    }

    /**
     * Полная очистка реестра
     */
    public void clear() {
        data.clear();
    }

    /**
     * Поиск значения записи по ключу
     *
     * @param key ключ записи
     * @return значение записи или null, если такого ключа не было в реестре
     */
    public T getByKey(String key) {
        return data.get(key);
    }

    /**
     * Поиск значений записей по имени
     *
     * @param name начало имени записей для поиска
     * @return список значений записей, у которых имя начинается с заданной подстроки
     */
    public List<T> getByName(String name) {
        List<T> values = new ArrayList<>();
        for (T value : data.values()) {
            if (value.getName().startsWith(name)) { // предполагается, что у класса T есть метод getName(), возвращающий имя
                values.add(value);
            }
        }
        return values;
    }
}
