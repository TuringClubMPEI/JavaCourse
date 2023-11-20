package ru.turing.courses.lesson3;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.lang.reflect.Method;

/**
 * Класс реализующий реестр
 *
 * @param <T> тип объекта в реестре
 */
public class Registry<T> {
    /**
     * Реестр основанный на HashMap, хранящий ассоциативный массив: <br>
     * Integer - ключ, T - заданный класс объектов
     */
    private final Map<Integer, T> storage = new HashMap<>();

    public Registry() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registry<?> registry = (Registry<?>) o;
        return Objects.equals(storage, registry.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage);
    }

    @Override
    public String toString() {
        return "Registry{" +
                "storage=" + storage +
                '}';
    }

    public Map<Integer, T> getStorage() {
        return storage;
    }

    /**
     * Функция для добавления новой записи в реестр
     *
     * @param id    ключ
     * @param value значение записи
     */
    public void add(Integer id, T value) {
        if (!storage.containsKey(id)) {
            storage.put(id, value);
        } else {
            System.out.println("Такой ключ уже существует");
        }

    }

    /**
     * Функция, удаляющая запись из реестра по ключу
     *
     * @param key ключ
     * @return возвращает значение удаленной записи
     */
    public T removeByKey(Integer key) {
        return storage.remove(key);
    }

    /**
     * Функция, удаляющая запись из реестра по заданному значению
     *
     * @param value заданное значение
     * @return возвращает List ключей удаленных записей
     */
    public List<Integer> removeByValue(T value) {
        List<Integer> removedNotes = new ArrayList<>();
        Iterator<Map.Entry<Integer, T>> iterator = storage.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, T> entry = iterator.next();
            if (entry.getValue() == value) {
                removedNotes.add(entry.getKey());
                iterator.remove();
            }
        }
        return removedNotes;
    }

    /**
     * Функция, полностью очищающая реестр
     */
    public void clear() {
        storage.clear();
    }

    /**
     * Функция возвращает значение по заданному id
     *
     * @param key ключ
     * @return T - найденное значение
     */
    public T getByKey(Integer key) {
        return storage.get(key);
    }

    /**
     * Функция нахождения значения по имени профиля в реестре
     *
     * @param name имя профиля
     * @return возвращает List найденных значений
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public List<T> getByName(String name) throws InvocationTargetException, IllegalAccessException {
        List<T> foundedByName = new ArrayList<>();
        for (Map.Entry<Integer, T> entry : storage.entrySet()) {
            Method[] methods = entry.getValue().getClass().getMethods();
            for (Method method : methods) {
                if (method.getName().equals("getName")) {
                    if (method.invoke(entry.getValue()).equals(name)) {
                        foundedByName.add(entry.getValue());
                    }
                    break;
                }
            }
        }
        return foundedByName;
    }

    /**
     * Смена ключа пользователя
     *
     * @param oldKey старый ключ
     * @param newKey новый ключ
     */
    public void changeKey(Integer oldKey, Integer newKey) {
        if (!storage.containsKey(oldKey)) {
            System.out.println("Такого ключа не существует");
            return;
        }
        if (storage.containsKey(newKey)) {
            System.out.println("Такой ключ уже существует");
            return;
        }
        add(newKey, getByKey(oldKey));
        removeByKey(oldKey);
    }
}
