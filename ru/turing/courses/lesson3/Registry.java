package ru.turing.courses.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Registry<T> {
    private final Map<String, T> registryMap;

    public Registry() {
        this.registryMap = new HashMap<>();
    }

    public void add(String key, T value) {
        registryMap.put(key, value);
    }

    public T removeByKey(String key) {
        return registryMap.remove(key);
    }

    public List<String> removeByValue(T value) {
        List<String> removedKeys = new ArrayList<>();
        registryMap.entrySet().removeIf(entry -> {
            if (entry.getValue().equals(value)) {
                removedKeys.add(entry.getKey());
                return true;
            }
            return false;
        });
        return removedKeys;
    }

    public void clear() {
        registryMap.clear();
    }

    public T getByKey(String key) {
        return registryMap.get(key);
    }

    public List<T> getByName(String name) {
        List<T> values = new ArrayList<>();
        for (Map.Entry<String, T> entry : registryMap.entrySet()) {
            if (entry.getValue().toString().equals(name)) {
                values.add(entry.getValue());
            }
        }
        return values;
    }

    public int size() {
        return registryMap.size();
    }

    public boolean containsKey(String key) {
        return registryMap.containsKey(key);
    }

    public boolean containsValue(T value) {
        return registryMap.containsValue(value);
    }
}