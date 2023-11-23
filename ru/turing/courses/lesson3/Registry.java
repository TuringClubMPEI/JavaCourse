package ru.turing.courses.lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class Registry<T extends Flower> {
    private final Map<Integer, T> storage = new HashMap<>();

    public void add(int key, T value) {
        storage.put(key, value);
    }

    public T removeByKey(int key) {
        return storage.remove(key);
    }

    public void clear() {
        storage.clear();
    }

    public T getByKey(int key) {
        return storage.get(key);
    }

    public List<Integer> removeByValue(T value) {
        List<Integer> keys = new ArrayList<>();
        if (storage.containsValue(value)) {
            for (Map.Entry<Integer, T> shelf : storage.entrySet()) {
                if (value == shelf.getValue()) {
                    keys.add(shelf.getKey());
                }
            }
            for (int key : keys) {
                storage.remove(key);
            }
            storage.entrySet().removeIf(shelf -> shelf.getValue().equals(value));
            return keys;
        }
        return Collections.emptyList();
    }

    public List<T> getByName(String colorOfFlower) {
        return storage.values().stream()
                .filter(value -> value != null && Objects.equals(value.getColorOfFlower(), colorOfFlower))
                .collect(Collectors.toList());
    }

    public void printColorOfFlowers() {
        for (Map.Entry<Integer, T> entry : storage.entrySet()) {
            System.out.println(entry.getKey() + ".Цвет = " + entry.getValue().getColorOfFlower());
        }
    }
}