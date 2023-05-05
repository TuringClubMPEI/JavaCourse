package ru.turing.courses.lesson3.privalov;

import ru.turing.courses.lesson3.privalov.engines.RocketEngine;

import java.util.*;

/**
 * Класс для регистра
 *
 * @param <T> -- использоваться модет только наследниками класса RocketEngine
 */
public class Registry<T extends RocketEngine> {
    /**
     * Так как ключ будет задаваться по хэш коду, первый параметр мапы -- интеджер
     */
    public Map<Integer, T> enginesWarehouse = new HashMap<>();

    public void add(int key, T value) {
        enginesWarehouse.put(key, value);
    }

    public T removeByKey(int key) {
        return enginesWarehouse.remove(key);
    }

    /**
     * Удалить запись по значению.
     * Создается список, в который помещаются ключи, по которым потом удалятся записи.
     * При обходе регистра если значение записи совпадает с заданным знаечнием, то ключ помещается в список.
     * При следующем обходе регистра записи с нужными ключами удаляются.
     */
    public List<Integer> removeByValue(T value) {
        List<Integer> keysForValuesToBeDeleted = new ArrayList<>();
        for (Map.Entry<Integer, T> entry : enginesWarehouse.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keysForValuesToBeDeleted.add(entry.getKey());
            }
        }

        for (int key : keysForValuesToBeDeleted) {
            enginesWarehouse.remove(key);
        }

        return keysForValuesToBeDeleted;
    }

    public void clear() {
        enginesWarehouse.clear();
    }

    public T getByKey(int key) {
        return enginesWarehouse.get(key);
    }

    /**
     * Вывод регистра с указанием ключа и именем инстанса
     */
    public void printAllEntries() {
        System.out.println("Ключ -- значение");
        for (Map.Entry<Integer, T> entry : enginesWarehouse.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue().getSerialName());
        }
    }
}
