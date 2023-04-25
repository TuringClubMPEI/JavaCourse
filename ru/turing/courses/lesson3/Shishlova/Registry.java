package ru.turing.courses.lesson3.Shishlova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry {
    // HashMap для хранения записей
    private Map<String, String> data = new HashMap<>();
    /**
     * Добавление новой записи в реестр
     *
     * @param key   ключ записи
     * @param value значение записи
     */
    public void add(String key, String value) {
        data.put(key, value);
    }

    /**
     * Удаление записи из реестра по заданному ключу
     *
     * @param key ключ записи
     * @return значение удаленной записи или null, если такого ключа не было в реестре
     */
    public String removeByKey(String key) {
        return data.remove(key);
    }

    /**
     * Удаление всех записей из реестра по заданному значению
     *
     * @param value значение записи
     * @return список ключей удаленных записей
     */
    public List<String> removeByValue(String value) {
        List<String> deletedKeys = new ArrayList<>();
        for (Map.Entry<String, String> entry : data.entrySet()) {
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
    public String getByKey(String key) {
        return data.get(key);
    }

    /**
     * Поиск значений записей по имени
     *
     * @param name начало имени записей для поиска
     * @return список значений записей, у которых имя начинается с заданной подстроки
     */
    public List<String> getByName(String name) {
        List<String> values = new ArrayList<>();
        for (String value : data.values()) {
            if (value.startsWith(name)) {
                values.add(value);
            }
        }
        return values;
    }
}