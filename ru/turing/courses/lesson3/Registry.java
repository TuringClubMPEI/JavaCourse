package ru.turing.courses.lesson3;

import java.util.*;

import ru.turing.courses.lesson2.Person;

public class Registry<T extends Person> {
    private final Map<Integer, T> storage = new HashMap<>();


    public void add(Integer key, T value) {
        this.storage.put(key, value);
    }


    public T removeByKey(Integer key) {
        T value = this.storage.get(key);
        this.storage.remove(key);
        return value;
    }

    public List<Integer> removeByValue(T value) {
        Iterator<Map.Entry<Integer, T>> iterator = this.storage.entrySet().iterator();
        List<Integer> keys = new ArrayList<>();
        while(iterator.hasNext()) {
            Map.Entry<Integer, T> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
                iterator.remove();
            }
        }
        return keys;
    }

    public void clear() {
        this.storage.clear();
    }


    public T getByKey(Integer key) {
        T value = this.storage.get(key);
        return value;
    }

    public List getByName(T value) {
        List<Integer> keys = new ArrayList<Integer>();
        for (Map.Entry<Integer, T> entry : this.storage.entrySet()) {
            if (value.equals(entry.getValue()))
                keys.add(entry.getKey());
        }
        return keys;
    }

    public int getSize() {
        return this.storage.size();
    }
}
