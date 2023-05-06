package ru.turing.courses.lesson3.Shishlova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry<T extends NamedObject> {
    private Map<String, T> objectsByKey = new HashMap<>();

    public void add(String key, T object) {
        objectsByKey.put(key, object);
    }

    public T getByKey(String key) {
        return objectsByKey.get(key);
    }

    public List<T> getByName(String name) {
        List<T> objectsByName = new ArrayList<>();
        for (T object : objectsByKey.values()) {
            if (object.getName().toLowerCase().startsWith(name.toLowerCase())) {
                objectsByName.add(object);
            }
        }
        return objectsByName;
    }

    public T removeByKey(String key) {
        return objectsByKey.remove(key);
    }

    public List<String> removeByValue(T object) {
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, T> entry : objectsByKey.entrySet()) {
            if (entry.getValue().equals(object)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key : keysToRemove) {
            objectsByKey.remove(key);
        }
        return keysToRemove;
    }

    public void clear() {
        objectsByKey.clear();
    }
}